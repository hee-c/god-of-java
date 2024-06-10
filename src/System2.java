package src;

import jdk.internal.access.SharedSecrets;
import jdk.internal.misc.VM;
import jdk.internal.util.StaticProperty;
import jdk.internal.util.SystemProps;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;

import static jdk.internal.access.SharedSecrets.setJavaLangAccess;

public class System2 {
    public static ReferenceOverloading out;

//    static {
//        out = new ReferenceOverloading();
//    }

    private static native void registerNatives();
    static {
        registerNatives();
    }

    private static void initPhase1() {
        out = new ReferenceOverloading();


        // register the shared secrets - do this first, since SystemProps.initProperties
        // might initialize CharsetDecoders that rely on it
//        setJavaLangAccess();

        // VM might invoke JNU_NewStringPlatform() to set those encoding
        // sensitive properties (user.home, user.name, boot.class.path, etc.)
        // during "props" initialization.
        // The charset is initialized in System.c and does not depend on the Properties.
//        Map<String, String> tempProps = SystemProps.initProperties();
//        VersionProps.init(tempProps);

        // There are certain system configurations that may be controlled by
        // VM options such as the maximum amount of direct memory and
        // Integer cache size used to support the object identity semantics
        // of autoboxing.  Typically, the library will obtain these values
        // from the properties set by the VM.  If the properties are for
        // internal implementation use only, these properties should be
        // masked from the system properties.
        //
        // Save a private copy of the system properties object that
        // can only be accessed by the internal implementation.
//        VM.saveProperties(tempProps);
//        props = createProperties(tempProps);
//
//        // Check if sun.jnu.encoding is supported. If not, replace it with UTF-8.
//        var jnuEncoding = props.getProperty("sun.jnu.encoding");
//        if (jnuEncoding == null || !Charset.isSupported(jnuEncoding)) {
//            notSupportedJnuEncoding = jnuEncoding == null ? "null" : jnuEncoding;
//            props.setProperty("sun.jnu.encoding", "UTF-8");
//        }
//
//        StaticProperty.javaHome();          // Load StaticProperty to cache the property values

//        lineSeparator = props.getProperty("line.separator");
//
//        FileInputStream fdIn = new FileInputStream(FileDescriptor.in);
//        FileOutputStream fdOut = new FileOutputStream(FileDescriptor.out);
//        FileOutputStream fdErr = new FileOutputStream(FileDescriptor.err);
//        initialIn = new BufferedInputStream(fdIn);
//        setIn0(initialIn);
//        // stdout/err.encoding are set when the VM is associated with the terminal,
//        // thus they are equivalent to Console.charset(), otherwise the encodings
//        // of those properties default to native.encoding
//        setOut0(newPrintStream(fdOut, props.getProperty("stdout.encoding")));
//        setErr0(newPrintStream(fdErr, props.getProperty("stderr.encoding")));
//
//        // Setup Java signal handlers for HUP, TERM, and INT (where available).
//        Terminator.setup();

        // Initialize any miscellaneous operating system settings that need to be
        // set for the class libraries. Currently this is no-op everywhere except
        // for Windows where the process-wide error mode is set before the java.io
        // classes are used.
//        VM.initializeOSEnvironment();

        // start Finalizer and Reference Handler threads
//        SharedSecrets.getJavaLangRefAccess().startThreads();

        // system properties, java.lang and other core classes are now initialized
//        VM.initLevel(1);
    }

    public static void main(String[] args) {
        System2.out.println(123);
    }
}

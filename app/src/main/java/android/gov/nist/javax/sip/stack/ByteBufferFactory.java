package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferFactory {
    private boolean useDirect = true;
    private static StackLogger logger = CommonLogger.getLogger(ByteBufferFactory.class);
    private static ByteBufferFactory instance = new ByteBufferFactory();

    public static ByteBufferFactory getInstance() {
        return instance;
    }

    public ByteBuffer allocate(int i10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logTrace("Allocating buffer " + i10);
        }
        return ByteBuffer.allocate(i10);
    }

    public ByteBuffer allocateDirect(int i10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logTrace("Allocating direct buffer " + i10);
        }
        if (this.useDirect) {
            return ByteBuffer.allocateDirect(i10);
        }
        return ByteBuffer.allocate(i10);
    }

    public void setUseDirect(boolean z10) {
        String str;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            if (z10) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            stackLogger.logTrace("Direct buffers are ".concat(str));
        }
        this.useDirect = z10;
    }
}

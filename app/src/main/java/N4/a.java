package N4;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class a extends RuntimeException {

    /* renamed from: Y  reason: collision with root package name */
    public final StringBuffer f12710Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, RuntimeException runtimeException) {
        super(str, runtimeException);
        if (str == null) {
            if (runtimeException != null) {
                str = runtimeException.getMessage();
            } else {
                str = null;
            }
        }
        if (runtimeException instanceof a) {
            String stringBuffer = ((a) runtimeException).f12710Y.toString();
            StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.length() + RCHTTPStatusCodes.SUCCESS);
            this.f12710Y = stringBuffer2;
            stringBuffer2.append(stringBuffer);
            return;
        }
        this.f12710Y = new StringBuffer((int) RCHTTPStatusCodes.SUCCESS);
    }

    public static a a(String str, RuntimeException runtimeException) {
        a aVar;
        if (runtimeException instanceof a) {
            aVar = (a) runtimeException;
        } else {
            aVar = new a(null, runtimeException);
        }
        if (str != null) {
            StringBuffer stringBuffer = aVar.f12710Y;
            stringBuffer.append(str);
            if (!str.endsWith(Separators.RETURN)) {
                stringBuffer.append('\n');
            }
            return aVar;
        }
        throw new NullPointerException("str == null");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f12710Y);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f12710Y);
    }
}

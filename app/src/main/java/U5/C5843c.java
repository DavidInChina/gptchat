package u5;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: u5.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5843c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46418Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f46419Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5843c(String str, int i10) {
        super(0);
        this.f46418Y = i10;
        this.f46419Z = str;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f46418Y;
        String str = this.f46419Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "Cannot add event receiver for feature \"%s\", it is not registered.", Arrays.copyOf(new Object[]{str}, 1));
            case 1:
                return String.format(Locale.US, "Feature \"%s\" already has event receiver registered, overwriting it.", Arrays.copyOf(new Object[]{str}, 1));
            case 2:
                return str;
            case 3:
                return android.gov.nist.core.a.A(Separators.DOUBLE_QUOTE, str, "\" is an invalid tag, and was ignored.");
            case 4:
                return android.gov.nist.core.a.A("An SdkCode with name ", str, " has already been registered.");
            case 5:
                return android.gov.nist.core.a.g(str, " failed because of a network error; we will retry later.");
            case 6:
                return android.gov.nist.core.a.g(str, " failed because your token is invalid; the batch was dropped. Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
            case 7:
            default:
                return android.gov.nist.core.a.A("Unable to convert [", str, "] to a valid graphql operation type");
            case 8:
                return android.gov.nist.core.a.g(str, " failed because of a processing error or invalid data; the batch was dropped.");
            case 9:
                return android.gov.nist.core.a.g(str, " not uploaded due to rate limitation; we will retry later.");
            case 10:
                return android.gov.nist.core.a.g(str, " failed because of a server processing error; we will retry later.");
            case 11:
                return android.gov.nist.core.a.g(str, " failed because of an unknown error; the batch was dropped.");
            case 12:
                return android.gov.nist.core.a.g(str, " failed because of an error when creating the request; the batch was dropped.");
            case 13:
                return android.gov.nist.core.a.g(str, " sent successfully.");
            case 14:
                return String.format(Locale.US, "Error while trying to deserialize the NetworkInfo: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 15:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 16:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 17:
                return R.a.r("Unexpected EOF at the operation=", str);
            case 18:
                return android.gov.nist.core.a.A("Received unknown broadcast intent: [", str, "]");
            case 19:
                return R.a.r("Kronos onError @host:", str);
            case 20:
                return String.format(Locale.US, "Error while trying to deserialize the serialized UserInfo: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 21:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 22:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 23:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 24:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 25:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 26:
                return String.format(Locale.US, "You set up a DatadogInterceptor for %s, but RUM features are disabled. Make sure you initialized the Datadog SDK with a valid Application Id, and that RUM features are enabled.", Arrays.copyOf(new Object[]{str}, 1));
            case 27:
                return String.format(Locale.US, "Unsupported HTTP method %s reported by OkHttp instrumentation, using GET instead", Arrays.copyOf(new Object[]{str}, 1));
            case 28:
                return String.format(Locale.US, "Unknown RUM event meta type value [%s]", Arrays.copyOf(new Object[]{str}, 1));
        }
    }
}

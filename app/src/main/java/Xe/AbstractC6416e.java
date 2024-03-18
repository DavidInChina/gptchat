package xe;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;

/* renamed from: xe.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6416e {

    /* renamed from: a  reason: collision with root package name */
    public static final C6417f f49883a = new C6417f(ParameterNames.TEXT, "plain");

    /* renamed from: b  reason: collision with root package name */
    public static final C6417f f49884b = new C6417f(ParameterNames.TEXT, "event-stream");

    static {
        new C6417f(ParameterNames.TEXT, Separators.STAR);
        new C6417f(ParameterNames.TEXT, "css");
        new C6417f(ParameterNames.TEXT, "csv");
        new C6417f(ParameterNames.TEXT, "html");
        new C6417f(ParameterNames.TEXT, "javascript");
        new C6417f(ParameterNames.TEXT, "vcard");
        new C6417f(ParameterNames.TEXT, "xml");
    }
}

package ma;

import Bi.c;
import android.app.Application;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ma.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4574a implements X9.a {

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat f39010c = DateFormat.getDateTimeInstance(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Application f39011a;

    /* renamed from: b  reason: collision with root package name */
    public final t f39012b;

    public C4574a(Application application, t tVar) {
        this.f39011a = application;
        this.f39012b = tVar;
    }

    @Override // X9.a
    public final X9.b a(X9.b bVar, boolean z10) {
        String str;
        if (!z10) {
            return bVar;
        }
        Locale locale = this.f39011a.getResources().getConfiguration().locale;
        if (((G) this.f39012b).c(ExperimentKey.LocalContextEnabled.INSTANCE)) {
            String displayLanguage = locale.getDisplayLanguage();
            String displayCountry = locale.getDisplayCountry();
            String format = f39010c.format(new Date());
            StringBuilder t10 = android.gov.nist.core.a.t("\n                *** Local context for the user and device you're chatting with:\n                - Locale language: ", displayLanguage, "\n                - Locale country: ", displayCountry, "\n                - Local time: ");
            t10.append(format);
            t10.append("\n            ");
            str = c.M1(t10.toString());
        } else {
            str = "";
        }
        if (str.length() > 0) {
            return X9.b.a(bVar, "Below is the context for this conversation, do not reply to this message:\n\n".concat(str), false, 6);
        }
        return bVar;
    }
}

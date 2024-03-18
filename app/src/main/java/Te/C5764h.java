package te;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Calendar;
import java.util.Locale;
import ke.q;
import nf.AbstractC4831k;
import xe.AbstractC6432u;
import xe.C6397B;
import xe.C6398C;

/* renamed from: te.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5764h {

    /* renamed from: a  reason: collision with root package name */
    public final C6398C f46146a;

    /* renamed from: b  reason: collision with root package name */
    public final He.b f46147b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6432u f46148c;

    /* renamed from: d  reason: collision with root package name */
    public final C6397B f46149d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f46150e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4831k f46151f;

    /* renamed from: g  reason: collision with root package name */
    public final He.b f46152g;

    public C5764h(C6398C c6398c, He.b bVar, q qVar, C6397B c6397b, Object obj, AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("requestTime", bVar);
        AbstractC3557B.c0(ParameterNames.VERSION, c6397b);
        AbstractC3557B.c0("body", obj);
        AbstractC3557B.c0("callContext", abstractC4831k);
        this.f46146a = c6398c;
        this.f46147b = bVar;
        this.f46148c = qVar;
        this.f46149d = c6397b;
        this.f46150e = obj;
        this.f46151f = abstractC4831k;
        Calendar calendar = Calendar.getInstance(He.a.f7667a, Locale.ROOT);
        AbstractC3557B.Z(calendar);
        this.f46152g = He.a.b(calendar, null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f46146a + ')';
    }
}

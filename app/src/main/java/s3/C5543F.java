package s3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: s3.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5543F {

    /* renamed from: a  reason: collision with root package name */
    public final W f45231a;

    /* renamed from: c  reason: collision with root package name */
    public final String f45233c;

    /* renamed from: g  reason: collision with root package name */
    public final X f45237g;

    /* renamed from: h  reason: collision with root package name */
    public final String f45238h;

    /* renamed from: b  reason: collision with root package name */
    public final int f45232b = -1;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f45234d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f45235e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f45236f = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f45239i = new ArrayList();

    public C5543F(X x10, String str, String str2) {
        AbstractC3557B.c0("provider", x10);
        AbstractC3557B.c0("startDestination", str);
        this.f45231a = x10.b(B2.u.y(C5544G.class));
        this.f45233c = str2;
        this.f45237g = x10;
        this.f45238h = str;
    }

    public final AbstractC5540C a() {
        AbstractC5540C a5 = this.f45231a.a();
        a5.f45217h0 = null;
        for (Map.Entry entry : this.f45234d.entrySet()) {
            String str = (String) entry.getKey();
            C5557g c5557g = (C5557g) entry.getValue();
            AbstractC3557B.c0("argumentName", str);
            AbstractC3557B.c0("argument", c5557g);
            a5.f45220k0.put(str, c5557g);
        }
        Iterator it = this.f45235e.iterator();
        while (it.hasNext()) {
            a5.r((C5573x) it.next());
        }
        Iterator it2 = this.f45236f.entrySet().iterator();
        if (!it2.hasNext()) {
            String str2 = this.f45233c;
            if (str2 != null) {
                a5.T(str2);
            }
            int i10 = this.f45232b;
            if (i10 != -1) {
                a5.f45221l0 = i10;
            }
            return a5;
        }
        Map.Entry entry2 = (Map.Entry) it2.next();
        ((Number) entry2.getKey()).intValue();
        AbstractC2469q0.p(entry2.getValue());
        AbstractC3557B.c0("action", null);
        throw null;
    }
}

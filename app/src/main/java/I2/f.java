package I2;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import l8.AbstractC4344b;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import s2.w;
import x8.k0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7969a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7970b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7971c;

    /* renamed from: d  reason: collision with root package name */
    public final w f7972d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7973e;

    public f(Context context) {
        Context context2;
        String str;
        TelephonyManager telephonyManager;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f7969a = context2;
        int i10 = AbstractC5530A.f45131a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                str = AbstractC4344b.n1(networkCountryIso);
                int[] a5 = g.a(str);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                k0 k0Var = g.f7974n;
                hashMap.put(2, (Long) k0Var.get(a5[0]));
                hashMap.put(3, (Long) g.f7975o.get(a5[1]));
                hashMap.put(4, (Long) g.f7976p.get(a5[2]));
                hashMap.put(5, (Long) g.f7977q.get(a5[3]));
                hashMap.put(10, (Long) g.f7978r.get(a5[4]));
                hashMap.put(9, (Long) g.f7979s.get(a5[5]));
                hashMap.put(7, (Long) k0Var.get(a5[0]));
                this.f7970b = hashMap;
                this.f7971c = 2000;
                this.f7972d = AbstractC5532b.f45146a;
                this.f7973e = true;
            }
        }
        str = AbstractC4344b.n1(Locale.getDefault().getCountry());
        int[] a52 = g.a(str);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        k0 k0Var2 = g.f7974n;
        hashMap2.put(2, (Long) k0Var2.get(a52[0]));
        hashMap2.put(3, (Long) g.f7975o.get(a52[1]));
        hashMap2.put(4, (Long) g.f7976p.get(a52[2]));
        hashMap2.put(5, (Long) g.f7977q.get(a52[3]));
        hashMap2.put(10, (Long) g.f7978r.get(a52[4]));
        hashMap2.put(9, (Long) g.f7979s.get(a52[5]));
        hashMap2.put(7, (Long) k0Var2.get(a52[0]));
        this.f7970b = hashMap2;
        this.f7971c = 2000;
        this.f7972d = AbstractC5532b.f45146a;
        this.f7973e = true;
    }
}

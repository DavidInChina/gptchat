package B2;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p2.AbstractC5058k;
import p2.C5072z;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1804a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public C5072z f1805b;

    /* renamed from: c  reason: collision with root package name */
    public C0207h f1806c;

    /* JADX WARN: Type inference failed for: r10v0, types: [R4.a, java.lang.Object] */
    public static C0207h a(C5072z c5072z) {
        String str;
        v2.o oVar = new v2.o();
        byte[] bArr = null;
        oVar.f47119b = null;
        Uri uri = c5072z.f42374Z;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        E e10 = new E(str, c5072z.f42378k0, oVar);
        com.google.android.gms.internal.play_billing.C it = c5072z.f42375h0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            str3.getClass();
            synchronized (((Map) e10.f1741d)) {
                ((Map) e10.f1741d).put(str2, str3);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = AbstractC5058k.f42084a;
        ?? obj = new Object();
        UUID uuid2 = c5072z.f42373Y;
        A a5 = D.f1734i0;
        uuid2.getClass();
        boolean z10 = c5072z.f42376i0;
        boolean z11 = c5072z.f42377j0;
        int[] y02 = M3.H.y0(c5072z.f42379l0);
        for (int i10 : y02) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            Gi.e.l(z12);
        }
        C0207h c0207h = new C0207h(uuid2, a5, e10, hashMap, z10, (int[]) y02.clone(), z11, obj, 300000L);
        byte[] bArr2 = c5072z.f42380m0;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        Gi.e.n(c0207h.f1794q0.isEmpty());
        c0207h.f1803z0 = 0;
        c0207h.f1780A0 = bArr;
        return c0207h;
    }
}

package E2;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p2.AbstractC5069w;
import p2.C5046A;
import p2.C5047B;
import p2.C5067u;
import p2.C5070x;
import p2.C5071y;
import p2.C5072z;
import s2.AbstractC5530A;
import v2.AbstractC5968g;

/* renamed from: E2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481m implements AbstractC0491x {

    /* renamed from: a  reason: collision with root package name */
    public final C0479k f4378a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC5968g f4379b;

    /* renamed from: c  reason: collision with root package name */
    public R4.a f4380c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4381d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4382e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4383f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4384g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4385h;

    public C0481m(Context context, L2.t tVar) {
        v2.m mVar = new v2.m(context);
        this.f4379b = mVar;
        C0479k c0479k = new C0479k(tVar);
        this.f4378a = c0479k;
        if (mVar != ((AbstractC5968g) c0479k.f4371e)) {
            c0479k.f4371e = mVar;
            ((Map) c0479k.f4368b).clear();
            ((Map) c0479k.f4369c).clear();
        }
        this.f4381d = -9223372036854775807L;
        this.f4382e = -9223372036854775807L;
        this.f4383f = -9223372036854775807L;
        this.f4384g = -3.4028235E38f;
        this.f4385h = -3.4028235E38f;
    }

    public static AbstractC0491x d(Class cls, AbstractC5968g abstractC5968g) {
        try {
            return (AbstractC0491x) cls.getConstructor(AbstractC5968g.class).newInstance(abstractC5968g);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // E2.AbstractC0491x
    public final AbstractC0491x a(B2.i iVar) {
        if (iVar != null) {
            C0479k c0479k = this.f4378a;
            c0479k.f4373g = iVar;
            for (AbstractC0491x abstractC0491x : ((Map) c0479k.f4369c).values()) {
                abstractC0491x.a(iVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0240, code lost:
        if (r2.f42353i0 == false) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [x8.N] */
    /* JADX WARN: Type inference failed for: r13v1, types: [R4.a] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [p2.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [p2.w, p2.x] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, p2.y] */
    @Override // E2.AbstractC0491x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0469a b(p2.H h10) {
        C0474f c0474f;
        R4.a aVar;
        long j6;
        Object obj;
        x8.k0 k0Var;
        String str;
        List list;
        C5067u c5067u;
        String str2;
        Uri uri;
        boolean z10;
        p2.C c10;
        C5072z c5072z;
        Object obj2;
        C5071y c5071y;
        p2.H h11 = h10;
        h11.f41808Z.getClass();
        String scheme = h11.f41808Z.f41760Y.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        p2.C c11 = h11.f41808Z;
        int y10 = AbstractC5530A.y(c11.f41760Y, c11.f41761Z);
        if (h11.f41808Z.f41768n0 != -9223372036854775807L) {
            L2.t tVar = (L2.t) this.f4378a.f4367a;
            if (tVar instanceof L2.o) {
                L2.o oVar = (L2.o) tVar;
                synchronized (oVar) {
                    oVar.f10636i0 = 1;
                }
            }
        }
        C0479k c0479k = this.f4378a;
        Map map = (Map) c0479k.f4369c;
        AbstractC0491x abstractC0491x = (AbstractC0491x) map.get(Integer.valueOf(y10));
        if (abstractC0491x == null) {
            w8.l a5 = c0479k.a(y10);
            if (a5 == null) {
                abstractC0491x = null;
            } else {
                abstractC0491x = (AbstractC0491x) a5.get();
                AbstractC2469q0.p(c0479k.f4372f);
                B2.i iVar = (B2.i) c0479k.f4373g;
                if (iVar != null) {
                    abstractC0491x.a(iVar);
                }
                R4.a aVar2 = (R4.a) c0479k.f4374h;
                if (aVar2 != null) {
                    abstractC0491x.c(aVar2);
                }
                map.put(Integer.valueOf(y10), abstractC0491x);
            }
        }
        Gi.e.p(abstractC0491x, "No suitable media source factory found for content type: " + y10);
        C5046A b10 = h11.f41809h0.b();
        C5047B c5047b = h11.f41809h0;
        if (c5047b.f41746Y == -9223372036854775807L) {
            b10.f41734a = this.f4381d;
        }
        if (c5047b.f41749i0 == -3.4028235E38f) {
            b10.f41737d = this.f4384g;
        }
        if (c5047b.f41750j0 == -3.4028235E38f) {
            b10.f41738e = this.f4385h;
        }
        if (c5047b.f41747Z == -9223372036854775807L) {
            b10.f41735b = this.f4382e;
        }
        if (c5047b.f41748h0 == -9223372036854775807L) {
            b10.f41736c = this.f4383f;
        }
        C5047B a10 = b10.a();
        if (!a10.equals(h11.f41809h0)) {
            C5071y c5071y2 = new C5071y();
            List emptyList = Collections.emptyList();
            x8.k0 k0Var2 = x8.k0.f49573j0;
            p2.D d10 = p2.D.f41769i0;
            C5070x c5070x = h11.f41811j0;
            ?? obj3 = new Object();
            obj3.f42338a = c5070x.f42350Y;
            obj3.f42339b = c5070x.f42351Z;
            obj3.f42340c = c5070x.f42352h0;
            obj3.f42341d = c5070x.f42353i0;
            obj3.f42342e = c5070x.f42354j0;
            String str3 = h11.f41807Y;
            p2.K k10 = h11.f41810i0;
            h11.f41809h0.b();
            p2.D d11 = h11.f41812k0;
            p2.C c12 = h11.f41808Z;
            if (c12 != null) {
                String str4 = c12.f41765k0;
                String str5 = c12.f41761Z;
                Uri uri2 = c12.f41760Y;
                List list2 = c12.f41764j0;
                ?? r11 = c12.f41766l0;
                Object obj4 = c12.f41767m0;
                C5072z c5072z2 = c12.f41762h0;
                if (c5072z2 != null) {
                    ?? obj5 = new Object();
                    obj2 = obj4;
                    obj5.f42359d = c5072z2.f42373Y;
                    obj5.f42360e = c5072z2.f42374Z;
                    obj5.f42361f = c5072z2.f42375h0;
                    obj5.f42356a = c5072z2.f42376i0;
                    obj5.f42357b = c5072z2.f42377j0;
                    obj5.f42358c = c5072z2.f42378k0;
                    obj5.f42362g = c5072z2.f42379l0;
                    obj5.f42363h = c5072z2.f42380m0;
                    c5071y = obj5;
                } else {
                    obj2 = obj4;
                    c5071y = new C5071y();
                }
                C5067u c5067u2 = c12.f41763i0;
                j6 = c12.f41768n0;
                c5067u = c5067u2;
                str2 = str5;
                uri = uri2;
                str = str4;
                list = list2;
                k0Var = r11;
                obj = obj2;
                c5071y2 = c5071y;
            } else {
                j6 = -9223372036854775807L;
                list = emptyList;
                k0Var = k0Var2;
                uri = null;
                str2 = null;
                c5067u = null;
                str = null;
                obj = null;
            }
            C5046A b11 = a10.b();
            if (((Uri) c5071y2.f42360e) != null && ((UUID) c5071y2.f42359d) == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            Gi.e.n(z10);
            if (uri != null) {
                if (((UUID) c5071y2.f42359d) != null) {
                    c5072z = new C5072z(c5071y2);
                } else {
                    c5072z = null;
                }
                c10 = new p2.C(uri, str2, c5072z, c5067u, list, str, k0Var, obj, j6);
            } else {
                c10 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str6 = str3;
            ?? abstractC5069w = new AbstractC5069w(obj3);
            C5047B a11 = b11.a();
            if (k10 == null) {
                k10 = p2.K.f41848N0;
            }
            h11 = new p2.H(str6, abstractC5069w, c10, a11, k10, d11);
        }
        AbstractC0469a b12 = abstractC0491x.b(h11);
        x8.N n10 = h11.f41808Z.f41766l0;
        if (!n10.isEmpty()) {
            AbstractC0469a[] abstractC0469aArr = new AbstractC0469a[n10.size() + 1];
            abstractC0469aArr[0] = b12;
            int i10 = 0;
            while (i10 < n10.size()) {
                AbstractC5968g abstractC5968g = this.f4379b;
                abstractC5968g.getClass();
                Object obj6 = new Object();
                R4.a aVar3 = this.f4380c;
                if (aVar3 != null) {
                    aVar = aVar3;
                } else {
                    aVar = obj6;
                }
                int i11 = i10 + 1;
                abstractC0469aArr[i11] = new f0(null, (p2.G) n10.get(i10), abstractC5968g, aVar, true, null);
                i10 = i11;
            }
            b12 = new G(abstractC0469aArr);
        }
        AbstractC0469a abstractC0469a = b12;
        C5070x c5070x2 = h11.f41811j0;
        long j10 = c5070x2.f42350Y;
        if (j10 == 0 && c5070x2.f42351Z == Long.MIN_VALUE) {
            c0474f = abstractC0469a;
        }
        long C10 = AbstractC5530A.C(j10);
        C5070x c5070x3 = h11.f41811j0;
        c0474f = new C0474f(abstractC0469a, C10, AbstractC5530A.C(c5070x3.f42351Z), !c5070x3.f42354j0, c5070x3.f42352h0, c5070x3.f42353i0);
        h11.f41808Z.getClass();
        if (h11.f41808Z.f41763i0 != null) {
            s2.p.g("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        }
        return c0474f;
    }

    @Override // E2.AbstractC0491x
    public final AbstractC0491x c(R4.a aVar) {
        if (aVar != null) {
            this.f4380c = aVar;
            C0479k c0479k = this.f4378a;
            c0479k.f4374h = aVar;
            for (AbstractC0491x abstractC0491x : ((Map) c0479k.f4369c).values()) {
                abstractC0491x.c(aVar);
            }
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}

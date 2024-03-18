package q4;

import Ng.B;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.S;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import jf.C3959i;
import k6.AbstractC4194d;
import s4.AbstractC5575a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: A  reason: collision with root package name */
    public final S f43829A;

    /* renamed from: B  reason: collision with root package name */
    public final r4.i f43830B;

    /* renamed from: C  reason: collision with root package name */
    public final r4.g f43831C;

    /* renamed from: D  reason: collision with root package name */
    public final o f43832D;

    /* renamed from: E  reason: collision with root package name */
    public final o4.c f43833E;

    /* renamed from: F  reason: collision with root package name */
    public final Integer f43834F;

    /* renamed from: G  reason: collision with root package name */
    public final Drawable f43835G;

    /* renamed from: H  reason: collision with root package name */
    public final Integer f43836H;

    /* renamed from: I  reason: collision with root package name */
    public final Drawable f43837I;

    /* renamed from: J  reason: collision with root package name */
    public final Integer f43838J;

    /* renamed from: K  reason: collision with root package name */
    public final Drawable f43839K;

    /* renamed from: L  reason: collision with root package name */
    public final d f43840L;

    /* renamed from: M  reason: collision with root package name */
    public final c f43841M;

    /* renamed from: a  reason: collision with root package name */
    public final Context f43842a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f43843b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5575a f43844c;

    /* renamed from: d  reason: collision with root package name */
    public final i f43845d;

    /* renamed from: e  reason: collision with root package name */
    public final o4.c f43846e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43847f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f43848g;

    /* renamed from: h  reason: collision with root package name */
    public final ColorSpace f43849h;

    /* renamed from: i  reason: collision with root package name */
    public final r4.d f43850i;

    /* renamed from: j  reason: collision with root package name */
    public final C3959i f43851j;

    /* renamed from: k  reason: collision with root package name */
    public final h4.c f43852k;

    /* renamed from: l  reason: collision with root package name */
    public final List f43853l;

    /* renamed from: m  reason: collision with root package name */
    public final t4.e f43854m;

    /* renamed from: n  reason: collision with root package name */
    public final Wh.q f43855n;

    /* renamed from: o  reason: collision with root package name */
    public final r f43856o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f43857p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f43858q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f43859r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f43860s;

    /* renamed from: t  reason: collision with root package name */
    public final b f43861t;

    /* renamed from: u  reason: collision with root package name */
    public final b f43862u;

    /* renamed from: v  reason: collision with root package name */
    public final b f43863v;

    /* renamed from: w  reason: collision with root package name */
    public final B f43864w;

    /* renamed from: x  reason: collision with root package name */
    public final B f43865x;

    /* renamed from: y  reason: collision with root package name */
    public final B f43866y;

    /* renamed from: z  reason: collision with root package name */
    public final B f43867z;

    public j(Context context, Object obj, AbstractC5575a abstractC5575a, i iVar, o4.c cVar, String str, Bitmap.Config config, ColorSpace colorSpace, r4.d dVar, C3959i c3959i, h4.c cVar2, List list, t4.e eVar, Wh.q qVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar, b bVar2, b bVar3, B b10, B b11, B b12, B b13, S s10, r4.i iVar2, r4.g gVar, o oVar, o4.c cVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar2, c cVar4) {
        this.f43842a = context;
        this.f43843b = obj;
        this.f43844c = abstractC5575a;
        this.f43845d = iVar;
        this.f43846e = cVar;
        this.f43847f = str;
        this.f43848g = config;
        this.f43849h = colorSpace;
        this.f43850i = dVar;
        this.f43851j = c3959i;
        this.f43852k = cVar2;
        this.f43853l = list;
        this.f43854m = eVar;
        this.f43855n = qVar;
        this.f43856o = rVar;
        this.f43857p = z10;
        this.f43858q = z11;
        this.f43859r = z12;
        this.f43860s = z13;
        this.f43861t = bVar;
        this.f43862u = bVar2;
        this.f43863v = bVar3;
        this.f43864w = b10;
        this.f43865x = b11;
        this.f43866y = b12;
        this.f43867z = b13;
        this.f43829A = s10;
        this.f43830B = iVar2;
        this.f43831C = gVar;
        this.f43832D = oVar;
        this.f43833E = cVar3;
        this.f43834F = num;
        this.f43835G = drawable;
        this.f43836H = num2;
        this.f43837I = drawable2;
        this.f43838J = num3;
        this.f43839K = drawable3;
        this.f43840L = dVar2;
        this.f43841M = cVar4;
    }

    public static h a(j jVar) {
        Context context = jVar.f43842a;
        jVar.getClass();
        return new h(jVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (AbstractC3557B.K(this.f43842a, jVar.f43842a) && AbstractC3557B.K(this.f43843b, jVar.f43843b) && AbstractC3557B.K(this.f43844c, jVar.f43844c) && AbstractC3557B.K(this.f43845d, jVar.f43845d) && AbstractC3557B.K(this.f43846e, jVar.f43846e) && AbstractC3557B.K(this.f43847f, jVar.f43847f) && this.f43848g == jVar.f43848g && ((Build.VERSION.SDK_INT < 26 || AbstractC3557B.K(this.f43849h, jVar.f43849h)) && this.f43850i == jVar.f43850i && AbstractC3557B.K(this.f43851j, jVar.f43851j) && AbstractC3557B.K(this.f43852k, jVar.f43852k) && AbstractC3557B.K(this.f43853l, jVar.f43853l) && AbstractC3557B.K(this.f43854m, jVar.f43854m) && AbstractC3557B.K(this.f43855n, jVar.f43855n) && AbstractC3557B.K(this.f43856o, jVar.f43856o) && this.f43857p == jVar.f43857p && this.f43858q == jVar.f43858q && this.f43859r == jVar.f43859r && this.f43860s == jVar.f43860s && this.f43861t == jVar.f43861t && this.f43862u == jVar.f43862u && this.f43863v == jVar.f43863v && AbstractC3557B.K(this.f43864w, jVar.f43864w) && AbstractC3557B.K(this.f43865x, jVar.f43865x) && AbstractC3557B.K(this.f43866y, jVar.f43866y) && AbstractC3557B.K(this.f43867z, jVar.f43867z) && AbstractC3557B.K(this.f43833E, jVar.f43833E) && AbstractC3557B.K(this.f43834F, jVar.f43834F) && AbstractC3557B.K(this.f43835G, jVar.f43835G) && AbstractC3557B.K(this.f43836H, jVar.f43836H) && AbstractC3557B.K(this.f43837I, jVar.f43837I) && AbstractC3557B.K(this.f43838J, jVar.f43838J) && AbstractC3557B.K(this.f43839K, jVar.f43839K) && AbstractC3557B.K(this.f43829A, jVar.f43829A) && AbstractC3557B.K(this.f43830B, jVar.f43830B) && this.f43831C == jVar.f43831C && AbstractC3557B.K(this.f43832D, jVar.f43832D) && AbstractC3557B.K(this.f43840L, jVar.f43840L) && AbstractC3557B.K(this.f43841M, jVar.f43841M))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int hashCode = (this.f43843b.hashCode() + (this.f43842a.hashCode() * 31)) * 31;
        int i26 = 0;
        AbstractC5575a abstractC5575a = this.f43844c;
        if (abstractC5575a != null) {
            i10 = abstractC5575a.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (hashCode + i10) * 31;
        i iVar = this.f43845d;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 31;
        o4.c cVar = this.f43846e;
        if (cVar != null) {
            i12 = cVar.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 31;
        String str = this.f43847f;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode2 = (this.f43848g.hashCode() + ((i29 + i13) * 31)) * 31;
        ColorSpace colorSpace = this.f43849h;
        if (colorSpace != null) {
            i14 = colorSpace.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode3 = (this.f43850i.hashCode() + ((hashCode2 + i14) * 31)) * 31;
        C3959i c3959i = this.f43851j;
        if (c3959i != null) {
            i15 = c3959i.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (hashCode3 + i15) * 31;
        if (this.f43852k != null) {
            i16 = h4.c.class.hashCode();
        } else {
            i16 = 0;
        }
        int f6 = AbstractC6463a.f(this.f43856o.f43894a, (((this.f43854m.hashCode() + AbstractC4194d.s(this.f43853l, (i30 + i16) * 31, 31)) * 31) + Arrays.hashCode(this.f43855n.f21240Y)) * 31, 31);
        int i31 = 1237;
        if (this.f43857p) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i32 = (f6 + i17) * 31;
        if (this.f43858q) {
            i18 = 1231;
        } else {
            i18 = 1237;
        }
        int i33 = (i32 + i18) * 31;
        if (this.f43859r) {
            i19 = 1231;
        } else {
            i19 = 1237;
        }
        int i34 = (i33 + i19) * 31;
        if (this.f43860s) {
            i31 = 1231;
        }
        int hashCode4 = this.f43861t.hashCode();
        int hashCode5 = this.f43862u.hashCode();
        int hashCode6 = this.f43863v.hashCode();
        int hashCode7 = this.f43864w.hashCode();
        int hashCode8 = this.f43865x.hashCode();
        int hashCode9 = this.f43866y.hashCode();
        int hashCode10 = this.f43867z.hashCode();
        int hashCode11 = this.f43829A.hashCode();
        int hashCode12 = this.f43830B.hashCode();
        int f10 = AbstractC6463a.f(this.f43832D.f43885Y, (this.f43831C.hashCode() + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((i34 + i31) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
        o4.c cVar2 = this.f43833E;
        if (cVar2 != null) {
            i20 = cVar2.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (f10 + i20) * 31;
        Integer num = this.f43834F;
        if (num != null) {
            i21 = num.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        Drawable drawable = this.f43835G;
        if (drawable != null) {
            i22 = drawable.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        Integer num2 = this.f43836H;
        if (num2 != null) {
            i23 = num2.hashCode();
        } else {
            i23 = 0;
        }
        int i38 = (i37 + i23) * 31;
        Drawable drawable2 = this.f43837I;
        if (drawable2 != null) {
            i24 = drawable2.hashCode();
        } else {
            i24 = 0;
        }
        int i39 = (i38 + i24) * 31;
        Integer num3 = this.f43838J;
        if (num3 != null) {
            i25 = num3.hashCode();
        } else {
            i25 = 0;
        }
        int i40 = (i39 + i25) * 31;
        Drawable drawable3 = this.f43839K;
        if (drawable3 != null) {
            i26 = drawable3.hashCode();
        }
        return this.f43841M.hashCode() + ((this.f43840L.hashCode() + ((i40 + i26) * 31)) * 31);
    }
}

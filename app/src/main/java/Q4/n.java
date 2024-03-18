package q4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import id.AbstractC3557B;
import java.util.Arrays;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f43869a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f43870b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f43871c;

    /* renamed from: d  reason: collision with root package name */
    public final r4.h f43872d;

    /* renamed from: e  reason: collision with root package name */
    public final r4.g f43873e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f43874f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f43875g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f43876h;

    /* renamed from: i  reason: collision with root package name */
    public final String f43877i;

    /* renamed from: j  reason: collision with root package name */
    public final Wh.q f43878j;

    /* renamed from: k  reason: collision with root package name */
    public final r f43879k;

    /* renamed from: l  reason: collision with root package name */
    public final o f43880l;

    /* renamed from: m  reason: collision with root package name */
    public final b f43881m;

    /* renamed from: n  reason: collision with root package name */
    public final b f43882n;

    /* renamed from: o  reason: collision with root package name */
    public final b f43883o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, r4.h hVar, r4.g gVar, boolean z10, boolean z11, boolean z12, String str, Wh.q qVar, r rVar, o oVar, b bVar, b bVar2, b bVar3) {
        this.f43869a = context;
        this.f43870b = config;
        this.f43871c = colorSpace;
        this.f43872d = hVar;
        this.f43873e = gVar;
        this.f43874f = z10;
        this.f43875g = z11;
        this.f43876h = z12;
        this.f43877i = str;
        this.f43878j = qVar;
        this.f43879k = rVar;
        this.f43880l = oVar;
        this.f43881m = bVar;
        this.f43882n = bVar2;
        this.f43883o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (AbstractC3557B.K(this.f43869a, nVar.f43869a) && this.f43870b == nVar.f43870b && ((Build.VERSION.SDK_INT < 26 || AbstractC3557B.K(this.f43871c, nVar.f43871c)) && AbstractC3557B.K(this.f43872d, nVar.f43872d) && this.f43873e == nVar.f43873e && this.f43874f == nVar.f43874f && this.f43875g == nVar.f43875g && this.f43876h == nVar.f43876h && AbstractC3557B.K(this.f43877i, nVar.f43877i) && AbstractC3557B.K(this.f43878j, nVar.f43878j) && AbstractC3557B.K(this.f43879k, nVar.f43879k) && AbstractC3557B.K(this.f43880l, nVar.f43880l) && this.f43881m == nVar.f43881m && this.f43882n == nVar.f43882n && this.f43883o == nVar.f43883o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f43870b.hashCode() + (this.f43869a.hashCode() * 31)) * 31;
        int i13 = 0;
        ColorSpace colorSpace = this.f43871c;
        if (colorSpace != null) {
            i10 = colorSpace.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (this.f43873e.hashCode() + ((this.f43872d.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31;
        int i14 = 1237;
        if (this.f43874f) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (hashCode2 + i11) * 31;
        if (this.f43875g) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (this.f43876h) {
            i14 = 1231;
        }
        int i17 = (i16 + i14) * 31;
        String str = this.f43877i;
        if (str != null) {
            i13 = str.hashCode();
        }
        int f6 = AbstractC6463a.f(this.f43880l.f43885Y, AbstractC6463a.f(this.f43879k.f43894a, (((i17 + i13) * 31) + Arrays.hashCode(this.f43878j.f21240Y)) * 31, 31), 31);
        return this.f43883o.hashCode() + ((this.f43882n.hashCode() + ((this.f43881m.hashCode() + f6) * 31)) * 31);
    }
}

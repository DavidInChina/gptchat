package q4;

import Ng.B;
import android.graphics.Bitmap;
import androidx.lifecycle.S;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final S f43768a;

    /* renamed from: b  reason: collision with root package name */
    public final r4.i f43769b;

    /* renamed from: c  reason: collision with root package name */
    public final r4.g f43770c;

    /* renamed from: d  reason: collision with root package name */
    public final B f43771d;

    /* renamed from: e  reason: collision with root package name */
    public final B f43772e;

    /* renamed from: f  reason: collision with root package name */
    public final B f43773f;

    /* renamed from: g  reason: collision with root package name */
    public final B f43774g;

    /* renamed from: h  reason: collision with root package name */
    public final t4.e f43775h;

    /* renamed from: i  reason: collision with root package name */
    public final r4.d f43776i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap.Config f43777j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f43778k;

    /* renamed from: l  reason: collision with root package name */
    public final Boolean f43779l;

    /* renamed from: m  reason: collision with root package name */
    public final b f43780m;

    /* renamed from: n  reason: collision with root package name */
    public final b f43781n;

    /* renamed from: o  reason: collision with root package name */
    public final b f43782o;

    public d(S s10, r4.i iVar, r4.g gVar, B b10, B b11, B b12, B b13, t4.e eVar, r4.d dVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f43768a = s10;
        this.f43769b = iVar;
        this.f43770c = gVar;
        this.f43771d = b10;
        this.f43772e = b11;
        this.f43773f = b12;
        this.f43774g = b13;
        this.f43775h = eVar;
        this.f43776i = dVar;
        this.f43777j = config;
        this.f43778k = bool;
        this.f43779l = bool2;
        this.f43780m = bVar;
        this.f43781n = bVar2;
        this.f43782o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (AbstractC3557B.K(this.f43768a, dVar.f43768a) && AbstractC3557B.K(this.f43769b, dVar.f43769b) && this.f43770c == dVar.f43770c && AbstractC3557B.K(this.f43771d, dVar.f43771d) && AbstractC3557B.K(this.f43772e, dVar.f43772e) && AbstractC3557B.K(this.f43773f, dVar.f43773f) && AbstractC3557B.K(this.f43774g, dVar.f43774g) && AbstractC3557B.K(this.f43775h, dVar.f43775h) && this.f43776i == dVar.f43776i && this.f43777j == dVar.f43777j && AbstractC3557B.K(this.f43778k, dVar.f43778k) && AbstractC3557B.K(this.f43779l, dVar.f43779l) && this.f43780m == dVar.f43780m && this.f43781n == dVar.f43781n && this.f43782o == dVar.f43782o) {
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
        int i24 = 0;
        S s10 = this.f43768a;
        if (s10 != null) {
            i10 = s10.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = i10 * 31;
        r4.i iVar = this.f43769b;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        r4.g gVar = this.f43770c;
        if (gVar != null) {
            i12 = gVar.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        B b10 = this.f43771d;
        if (b10 != null) {
            i13 = b10.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        B b11 = this.f43772e;
        if (b11 != null) {
            i14 = b11.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        B b12 = this.f43773f;
        if (b12 != null) {
            i15 = b12.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (i29 + i15) * 31;
        B b13 = this.f43774g;
        if (b13 != null) {
            i16 = b13.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 31;
        t4.e eVar = this.f43775h;
        if (eVar != null) {
            i17 = eVar.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (i31 + i17) * 31;
        r4.d dVar = this.f43776i;
        if (dVar != null) {
            i18 = dVar.hashCode();
        } else {
            i18 = 0;
        }
        int i33 = (i32 + i18) * 31;
        Bitmap.Config config = this.f43777j;
        if (config != null) {
            i19 = config.hashCode();
        } else {
            i19 = 0;
        }
        int i34 = (i33 + i19) * 31;
        Boolean bool = this.f43778k;
        if (bool != null) {
            i20 = bool.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (i34 + i20) * 31;
        Boolean bool2 = this.f43779l;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        b bVar = this.f43780m;
        if (bVar != null) {
            i22 = bVar.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        b bVar2 = this.f43781n;
        if (bVar2 != null) {
            i23 = bVar2.hashCode();
        } else {
            i23 = 0;
        }
        int i38 = (i37 + i23) * 31;
        b bVar3 = this.f43782o;
        if (bVar3 != null) {
            i24 = bVar3.hashCode();
        }
        return i38 + i24;
    }
}

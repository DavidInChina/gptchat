package M5;

import android.content.Context;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import q5.EnumC5273c;
import t3.p;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC3957g f11631Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC3957g f11632Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC3957g f11633h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC3957g f11634i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC3957g f11635j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f11636k0 = "Android";

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC3957g f11637l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC3957g f11638m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AbstractC3957g f11639n0;

    public f(Context context) {
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f11631Y = R4.b.C1(enumC3958h, new p(context, 3));
        this.f11632Z = R4.b.C1(enumC3958h, new e(this, 0));
        this.f11633h0 = R4.b.C1(enumC3958h, d.f11624h0);
        this.f11634i0 = R4.b.C1(enumC3958h, d.f11626j0);
        this.f11635j0 = R4.b.C1(enumC3958h, d.f11625i0);
        this.f11637l0 = R4.b.C1(enumC3958h, d.f11627k0);
        this.f11638m0 = R4.b.C1(enumC3958h, new e(this, 1));
        this.f11639n0 = R4.b.C1(enumC3958h, d.f11623Z);
    }

    @Override // M5.a
    public final String D() {
        Object value = this.f11634i0.getValue();
        AbstractC3557B.b0("<get-deviceModel>(...)", value);
        return (String) value;
    }

    @Override // M5.a
    public final String G() {
        Object value = this.f11637l0.getValue();
        AbstractC3557B.b0("<get-osVersion>(...)", value);
        return (String) value;
    }

    @Override // M5.a
    public final EnumC5273c L() {
        return (EnumC5273c) this.f11631Y.getValue();
    }

    @Override // M5.a
    public final String l() {
        return (String) this.f11633h0.getValue();
    }

    @Override // M5.a
    public final String n() {
        return (String) this.f11638m0.getValue();
    }

    @Override // M5.a
    public final String r() {
        return (String) this.f11639n0.getValue();
    }

    @Override // M5.a
    public final String t() {
        return (String) this.f11632Z.getValue();
    }

    @Override // M5.a
    public final String u() {
        Object value = this.f11635j0.getValue();
        AbstractC3557B.b0("<get-deviceBuildId>(...)", value);
        return (String) value;
    }

    @Override // M5.a
    public final String y() {
        return this.f11636k0;
    }
}

package c0;

import java.util.List;
import kf.AbstractC4276a;
import kf.AbstractC4280e;
import nf.AbstractC4828h;

/* renamed from: c0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2271a extends AbstractC4280e implements AbstractC2272b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC2272b f26037Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f26038Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f26039h0;

    public C2271a(AbstractC2272b abstractC2272b, int i10, int i11) {
        this.f26037Y = abstractC2272b;
        this.f26038Z = i10;
        AbstractC4828h.x(i10, i11, ((AbstractC4276a) abstractC2272b).r());
        this.f26039h0 = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4828h.v(i10, this.f26039h0);
        return this.f26037Y.get(this.f26038Z + i10);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f26039h0;
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final List subList(int i10, int i11) {
        AbstractC4828h.x(i10, i11, this.f26039h0);
        int i12 = this.f26038Z;
        return new C2271a(this.f26037Y, i10 + i12, i12 + i11);
    }
}

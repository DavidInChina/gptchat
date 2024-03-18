package yh;

import java.lang.reflect.Field;
import yh.l1;

/* loaded from: classes2.dex */
public final class Z extends AbstractC6598c0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Field f50982Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ AbstractC6643w f50983h0;

    public Z(Field field) {
        this.f50982Z = field;
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        AbstractC6643w abstractC6643w;
        if (this.f50983h0 != null) {
            abstractC6643w = null;
        } else {
            abstractC6643w = EnumC6628o.a(this.f50982Z.getGenericType(), j1());
        }
        if (abstractC6643w == null) {
            return this.f50983h0;
        }
        this.f50983h0 = abstractC6643w;
        return abstractC6643w;
    }

    @Override // yh.AbstractC6598c0
    public final Y j1() {
        return new C6590B(this.f50982Z);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return C6641v.l1(this.f50982Z.getType());
    }
}

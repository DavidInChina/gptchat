package s3;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class N extends S {

    /* renamed from: m  reason: collision with root package name */
    public final Class f45260m;

    public N(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f45260m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // s3.S, s3.T
    public final String b() {
        return this.f45260m.getName();
    }

    /* renamed from: g */
    public final Enum f(String str) {
        Enum r42;
        Class cls = this.f45260m;
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC3557B.b0("type.enumConstants", enumConstants);
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                r42 = enumConstants[i10];
                if (Lg.n.f2(((Enum) r42).name(), str)) {
                    break;
                }
                i10++;
            } else {
                r42 = null;
                break;
            }
        }
        Enum r43 = r42;
        if (r43 != null) {
            return r43;
        }
        StringBuilder s10 = android.gov.nist.core.a.s("Enum value ", str, " not found for type ");
        s10.append(cls.getName());
        s10.append('.');
        throw new IllegalArgumentException(s10.toString());
    }
}

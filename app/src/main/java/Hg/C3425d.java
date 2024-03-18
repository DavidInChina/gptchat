package hg;

import lg.q;

/* renamed from: hg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3425d extends AbstractC3426e {

    /* renamed from: c  reason: collision with root package name */
    public final q[] f32295c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3425d(int i10, q[] qVarArr) {
        super(i10, r1);
        if (qVarArr != null) {
            int i11 = 1;
            int length = qVarArr.length - 1;
            if (length != 0) {
                for (int i12 = 31; i12 >= 0; i12--) {
                    if (((1 << i12) & length) != 0) {
                        i11 = 1 + i12;
                    }
                }
                throw new IllegalStateException("Empty enum: " + qVarArr.getClass());
            }
            this.f32295c = qVarArr;
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
    }

    public final Object c(int i10) {
        q[] qVarArr;
        int i11 = this.f32296a;
        int i12 = (i10 & (((1 << this.f32297b) - 1) << i11)) >> i11;
        for (q qVar : this.f32295c) {
            if (qVar.a() == i12) {
                return qVar;
            }
        }
        return null;
    }
}

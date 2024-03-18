package T0;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: T0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413h implements AbstractC1414i {

    /* renamed from: a  reason: collision with root package name */
    public final int f16787a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16788b;

    public C1413h(int i10, int i11) {
        this.f16787a = i10;
        this.f16788b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[LOOP:0: B:3:0x0003->B:15:0x002f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[LOOP:1: B:17:0x0033->B:29:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032 A[EDGE_INSN: B:33:0x0032->B:16:0x0032 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[EDGE_INSN: B:34:0x0070->B:30:0x0070 ?: BREAK  , SYNTHETIC] */
    @Override // T0.AbstractC1414i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k kVar) {
        int i10;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16787a; i12++) {
            int i13 = i11 + 1;
            if (kVar.f16792b > i13) {
                char b10 = kVar.b((i10 - i13) - 1);
                char b11 = kVar.b(kVar.f16792b - i13);
                if (Character.isHighSurrogate(b10) && Character.isLowSurrogate(b11)) {
                    i11 += 2;
                    if (i11 != kVar.f16792b) {
                        break;
                    }
                }
            }
            i11 = i13;
            if (i11 != kVar.f16792b) {
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f16788b; i15++) {
            int i16 = i14 + 1;
            int i17 = kVar.f16793c + i16;
            t tVar = kVar.f16791a;
            if (i17 < tVar.a()) {
                char b12 = kVar.b((kVar.f16793c + i16) - 1);
                char b13 = kVar.b(kVar.f16793c + i16);
                if (Character.isHighSurrogate(b12) && Character.isLowSurrogate(b13)) {
                    i14 += 2;
                    if (kVar.f16793c + i14 != tVar.a()) {
                        break;
                    }
                }
            }
            i14 = i16;
            if (kVar.f16793c + i14 != tVar.a()) {
            }
        }
        int i18 = kVar.f16793c;
        kVar.a(i18, i14 + i18);
        int i19 = kVar.f16792b;
        kVar.a(i19 - i11, i19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1413h)) {
            return false;
        }
        C1413h c1413h = (C1413h) obj;
        if (this.f16787a == c1413h.f16787a && this.f16788b == c1413h.f16788b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16787a * 31) + this.f16788b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f16787a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC2469q0.j(sb2, this.f16788b, ')');
    }
}

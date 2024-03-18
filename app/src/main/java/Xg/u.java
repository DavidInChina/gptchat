package xg;

import id.AbstractC3557B;
import kg.C4290b;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f50042a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f50043b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f50044c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f50045d;

    /* renamed from: e  reason: collision with root package name */
    public final String f50046e;

    /* renamed from: f  reason: collision with root package name */
    public final C4290b f50047f;

    public u(jg.g gVar, jg.g gVar2, jg.g gVar3, jg.g gVar4, String str, C4290b c4290b) {
        AbstractC3557B.c0("filePath", str);
        this.f50042a = gVar;
        this.f50043b = gVar2;
        this.f50044c = gVar3;
        this.f50045d = gVar4;
        this.f50046e = str;
        this.f50047f = c4290b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3557B.K(this.f50042a, uVar.f50042a) && AbstractC3557B.K(this.f50043b, uVar.f50043b) && AbstractC3557B.K(this.f50044c, uVar.f50044c) && AbstractC3557B.K(this.f50045d, uVar.f50045d) && AbstractC3557B.K(this.f50046e, uVar.f50046e) && AbstractC3557B.K(this.f50047f, uVar.f50047f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        Object obj = this.f50042a;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i14 = i10 * 31;
        Object obj2 = this.f50043b;
        if (obj2 == null) {
            i11 = 0;
        } else {
            i11 = obj2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Object obj3 = this.f50044c;
        if (obj3 == null) {
            i12 = 0;
        } else {
            i12 = obj3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Object obj4 = this.f50045d;
        if (obj4 != null) {
            i13 = obj4.hashCode();
        }
        return this.f50047f.hashCode() + E9.f.v(this.f50046e, (i16 + i13) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f50042a + ", compilerVersion=" + this.f50043b + ", languageVersion=" + this.f50044c + ", expectedVersion=" + this.f50045d + ", filePath=" + this.f50046e + ", classId=" + this.f50047f + ')';
    }
}

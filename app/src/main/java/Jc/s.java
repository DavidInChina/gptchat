package Jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class s {
    public static final r Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f9064d = {null, null, E.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final String f9065a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f9066b;

    /* renamed from: c  reason: collision with root package name */
    public final E f9067c;

    public s(int i10, String str, Integer num, E e10) {
        if (7 != (i10 & 7)) {
            R4.b.e2(i10, 7, q.f9063b);
            throw null;
        }
        this.f9065a = str;
        this.f9066b = num;
        this.f9067c = e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f9065a, sVar.f9065a) && AbstractC3557B.K(this.f9066b, sVar.f9066b) && this.f9067c == sVar.f9067c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f9065a.hashCode() * 31;
        Integer num = this.f9066b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return this.f9067c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "FileServiceFilesRequest(fileName=" + this.f9065a + ", fileSize=" + this.f9066b + ", useCase=" + this.f9067c + Separators.RPAREN;
    }

    public s(String str, Integer num, E e10) {
        AbstractC3557B.c0("fileName", str);
        AbstractC3557B.c0("useCase", e10);
        this.f9065a = str;
        this.f9066b = num;
        this.f9067c = e10;
    }
}

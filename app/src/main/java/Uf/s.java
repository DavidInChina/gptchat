package Uf;

import cg.C2416g;
import cg.EnumC2415f;
import id.AbstractC3557B;
import java.util.Collection;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final C2416g f17831a;

    /* renamed from: b  reason: collision with root package name */
    public final Collection f17832b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17833c;

    public s(C2416g c2416g, Collection collection, boolean z10) {
        AbstractC3557B.c0("qualifierApplicabilityTypes", collection);
        this.f17831a = c2416g;
        this.f17832b = collection;
        this.f17833c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3557B.K(this.f17831a, sVar.f17831a) && AbstractC3557B.K(this.f17832b, sVar.f17832b) && this.f17833c == sVar.f17833c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f17832b.hashCode() + (this.f17831a.hashCode() * 31)) * 31;
        if (this.f17833c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f17831a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f17832b);
        sb2.append(", definitelyNotNull=");
        return AbstractC6463a.l(sb2, this.f17833c, ')');
    }

    public s(C2416g c2416g, Collection collection) {
        this(c2416g, collection, c2416g.f26632a == EnumC2415f.f26630h0);
    }
}

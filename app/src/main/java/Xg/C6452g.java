package xg;

import Mf.V;
import fg.C3042j;
import hg.AbstractC3423b;
import hg.AbstractC3428g;
import id.AbstractC3557B;

/* renamed from: xg.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6452g {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3428g f50000a;

    /* renamed from: b  reason: collision with root package name */
    public final C3042j f50001b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3423b f50002c;

    /* renamed from: d  reason: collision with root package name */
    public final V f50003d;

    public C6452g(AbstractC3428g abstractC3428g, C3042j c3042j, AbstractC3423b abstractC3423b, V v10) {
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("classProto", c3042j);
        AbstractC3557B.c0("metadataVersion", abstractC3423b);
        AbstractC3557B.c0("sourceElement", v10);
        this.f50000a = abstractC3428g;
        this.f50001b = c3042j;
        this.f50002c = abstractC3423b;
        this.f50003d = v10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6452g)) {
            return false;
        }
        C6452g c6452g = (C6452g) obj;
        if (AbstractC3557B.K(this.f50000a, c6452g.f50000a) && AbstractC3557B.K(this.f50001b, c6452g.f50001b) && AbstractC3557B.K(this.f50002c, c6452g.f50002c) && AbstractC3557B.K(this.f50003d, c6452g.f50003d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f50001b.hashCode();
        int hashCode2 = this.f50002c.hashCode();
        return this.f50003d.hashCode() + ((hashCode2 + ((hashCode + (this.f50000a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f50000a + ", classProto=" + this.f50001b + ", metadataVersion=" + this.f50002c + ", sourceElement=" + this.f50003d + ')';
    }
}

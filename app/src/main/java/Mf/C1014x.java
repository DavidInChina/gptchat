package Mf;

import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import kg.C4294f;
import l8.AbstractC4344b;

/* renamed from: Mf.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1014x extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final C4294f f12124a;

    /* renamed from: b  reason: collision with root package name */
    public final Eg.g f12125b;

    public C1014x(C4294f c4294f, Eg.g gVar) {
        AbstractC3557B.c0("underlyingPropertyName", c4294f);
        AbstractC3557B.c0("underlyingType", gVar);
        this.f12124a = c4294f;
        this.f12125b = gVar;
    }

    @Override // Mf.f0
    public final boolean a(C4294f c4294f) {
        return AbstractC3557B.K(this.f12124a, c4294f);
    }

    @Override // Mf.f0
    public final List b() {
        return AbstractC4344b.F0(new C3959i(this.f12124a, this.f12125b));
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f12124a + ", underlyingType=" + this.f12125b + ')';
    }
}

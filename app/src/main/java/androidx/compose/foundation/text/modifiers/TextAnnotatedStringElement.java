package androidx.compose.foundation.text.modifiers;

import G0.X;
import M.n;
import N0.C1046e;
import N0.E;
import S0.r;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LG0/X;", "LM/n;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TextAnnotatedStringElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C1046e f24762b;

    /* renamed from: c  reason: collision with root package name */
    public final E f24763c;

    /* renamed from: d  reason: collision with root package name */
    public final r f24764d;

    /* renamed from: e  reason: collision with root package name */
    public final k f24765e;

    /* renamed from: f  reason: collision with root package name */
    public final int f24766f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24767g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24768h;

    /* renamed from: i  reason: collision with root package name */
    public final int f24769i;

    /* renamed from: j  reason: collision with root package name */
    public final List f24770j;

    /* renamed from: k  reason: collision with root package name */
    public final k f24771k;

    public TextAnnotatedStringElement(C1046e c1046e, E e10, r rVar, k kVar, int i10, boolean z10, int i11, int i12, List list, k kVar2) {
        this.f24762b = c1046e;
        this.f24763c = e10;
        this.f24764d = rVar;
        this.f24765e = kVar;
        this.f24766f = i10;
        this.f24767g = z10;
        this.f24768h = i11;
        this.f24769i = i12;
        this.f24770j = list;
        this.f24771k = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        textAnnotatedStringElement.getClass();
        if (AbstractC3557B.K(null, null) && AbstractC3557B.K(this.f24762b, textAnnotatedStringElement.f24762b) && AbstractC3557B.K(this.f24763c, textAnnotatedStringElement.f24763c) && AbstractC3557B.K(this.f24770j, textAnnotatedStringElement.f24770j) && AbstractC3557B.K(this.f24764d, textAnnotatedStringElement.f24764d) && AbstractC3557B.K(this.f24765e, textAnnotatedStringElement.f24765e) && AbstractC3557B.D0(this.f24766f, textAnnotatedStringElement.f24766f) && this.f24767g == textAnnotatedStringElement.f24767g && this.f24768h == textAnnotatedStringElement.f24768h && this.f24769i == textAnnotatedStringElement.f24769i && AbstractC3557B.K(this.f24771k, textAnnotatedStringElement.f24771k) && AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f24764d.hashCode() + ((this.f24763c.hashCode() + (this.f24762b.hashCode() * 31)) * 31)) * 31;
        int i13 = 0;
        k kVar = this.f24765e;
        if (kVar != null) {
            i10 = kVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (((hashCode + i10) * 31) + this.f24766f) * 31;
        if (this.f24767g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (((((i14 + i11) * 31) + this.f24768h) * 31) + this.f24769i) * 31;
        List list = this.f24770j;
        if (list != null) {
            i12 = list.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        k kVar2 = this.f24771k;
        if (kVar2 != null) {
            i13 = kVar2.hashCode();
        }
        return (i16 + i13) * 961;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new n(this.f24762b, this.f24763c, this.f24764d, this.f24765e, this.f24766f, this.f24767g, this.f24768h, this.f24769i, this.f24770j, this.f24771k, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r3.f12487a.b(r0.f12487a) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // G0.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(AbstractC4325q abstractC4325q) {
        boolean z10;
        C1046e c1046e;
        C1046e c1046e2;
        boolean z11;
        n nVar = (n) abstractC4325q;
        nVar.getClass();
        if (!(!AbstractC3557B.K(null, null))) {
            E e10 = nVar.f11342t0;
            E e11 = this.f24763c;
            if (e11 == e10) {
                e11.getClass();
            }
            z10 = false;
            c1046e = nVar.f11341s0;
            c1046e2 = this.f24762b;
            if (!AbstractC3557B.K(c1046e, c1046e2)) {
                z11 = false;
            } else {
                nVar.f11341s0 = c1046e2;
                nVar.f11340G0.setValue(null);
                z11 = true;
            }
            nVar.A0(z10, z11, nVar.F0(this.f24763c, this.f24770j, this.f24769i, this.f24768h, this.f24767g, this.f24764d, this.f24766f), nVar.E0(this.f24765e, this.f24771k, null));
        }
        z10 = true;
        c1046e = nVar.f11341s0;
        c1046e2 = this.f24762b;
        if (!AbstractC3557B.K(c1046e, c1046e2)) {
        }
        nVar.A0(z10, z11, nVar.F0(this.f24763c, this.f24770j, this.f24769i, this.f24768h, this.f24767g, this.f24764d, this.f24766f), nVar.E0(this.f24765e, this.f24771k, null));
    }
}

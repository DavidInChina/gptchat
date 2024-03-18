package androidx.compose.foundation.text.modifiers;

import G0.AbstractC0579h;
import G0.X;
import M.f;
import M.h;
import M.n;
import N0.C1046e;
import N0.E;
import S0.r;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;
import l0.AbstractC4325q;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LG0/X;", "LM/f;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final C1046e f24751b;

    /* renamed from: c  reason: collision with root package name */
    public final E f24752c;

    /* renamed from: d  reason: collision with root package name */
    public final r f24753d;

    /* renamed from: e  reason: collision with root package name */
    public final k f24754e;

    /* renamed from: f  reason: collision with root package name */
    public final int f24755f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24756g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24757h;

    /* renamed from: i  reason: collision with root package name */
    public final int f24758i;

    /* renamed from: j  reason: collision with root package name */
    public final List f24759j;

    /* renamed from: k  reason: collision with root package name */
    public final k f24760k;

    /* renamed from: l  reason: collision with root package name */
    public final h f24761l;

    public SelectableTextAnnotatedStringElement(C1046e c1046e, E e10, r rVar, k kVar, int i10, boolean z10, int i11, int i12, List list, k kVar2, h hVar) {
        this.f24751b = c1046e;
        this.f24752c = e10;
        this.f24753d = rVar;
        this.f24754e = kVar;
        this.f24755f = i10;
        this.f24756g = z10;
        this.f24757h = i11;
        this.f24758i = i12;
        this.f24759j = list;
        this.f24760k = kVar2;
        this.f24761l = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        selectableTextAnnotatedStringElement.getClass();
        if (AbstractC3557B.K(null, null) && AbstractC3557B.K(this.f24751b, selectableTextAnnotatedStringElement.f24751b) && AbstractC3557B.K(this.f24752c, selectableTextAnnotatedStringElement.f24752c) && AbstractC3557B.K(this.f24759j, selectableTextAnnotatedStringElement.f24759j) && AbstractC3557B.K(this.f24753d, selectableTextAnnotatedStringElement.f24753d) && AbstractC3557B.K(this.f24754e, selectableTextAnnotatedStringElement.f24754e) && AbstractC3557B.D0(this.f24755f, selectableTextAnnotatedStringElement.f24755f) && this.f24756g == selectableTextAnnotatedStringElement.f24756g && this.f24757h == selectableTextAnnotatedStringElement.f24757h && this.f24758i == selectableTextAnnotatedStringElement.f24758i && AbstractC3557B.K(this.f24760k, selectableTextAnnotatedStringElement.f24760k) && AbstractC3557B.K(this.f24761l, selectableTextAnnotatedStringElement.f24761l)) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = (this.f24753d.hashCode() + ((this.f24752c.hashCode() + (this.f24751b.hashCode() * 31)) * 31)) * 31;
        int i14 = 0;
        k kVar = this.f24754e;
        if (kVar != null) {
            i10 = kVar.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((hashCode + i10) * 31) + this.f24755f) * 31;
        if (this.f24756g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (((((i15 + i11) * 31) + this.f24757h) * 31) + this.f24758i) * 31;
        List list = this.f24759j;
        if (list != null) {
            i12 = list.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        k kVar2 = this.f24760k;
        if (kVar2 != null) {
            i13 = kVar2.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        h hVar = this.f24761l;
        if (hVar != null) {
            i14 = hVar.hashCode();
        }
        return (i18 + i14) * 31;
    }

    @Override // G0.X
    public final AbstractC4325q j() {
        return new f(this.f24751b, this.f24752c, this.f24753d, this.f24754e, this.f24755f, this.f24756g, this.f24757h, this.f24758i, this.f24759j, this.f24760k, this.f24761l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r6.f12487a.b(r2.f12487a) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // G0.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(AbstractC4325q abstractC4325q) {
        boolean z10;
        C1046e c1046e;
        C1046e c1046e2;
        f fVar = (f) abstractC4325q;
        n nVar = fVar.f11307v0;
        nVar.getClass();
        boolean z11 = true;
        boolean z12 = !AbstractC3557B.K(null, null);
        E e10 = this.f24752c;
        if (!z12) {
            E e11 = nVar.f11342t0;
            if (e10 == e11) {
                e10.getClass();
            }
            z10 = false;
            c1046e = nVar.f11341s0;
            c1046e2 = this.f24751b;
            if (!AbstractC3557B.K(c1046e, c1046e2)) {
                z11 = false;
            } else {
                nVar.f11341s0 = c1046e2;
                nVar.f11340G0.setValue(null);
            }
            boolean F02 = fVar.f11307v0.F0(e10, this.f24759j, this.f24758i, this.f24757h, this.f24756g, this.f24753d, this.f24755f);
            k kVar = this.f24754e;
            k kVar2 = this.f24760k;
            h hVar = this.f24761l;
            nVar.A0(z10, z11, F02, nVar.E0(kVar, kVar2, hVar));
            fVar.f11306u0 = hVar;
            AbstractC0579h.u(fVar);
        }
        z10 = true;
        c1046e = nVar.f11341s0;
        c1046e2 = this.f24751b;
        if (!AbstractC3557B.K(c1046e, c1046e2)) {
        }
        boolean F022 = fVar.f11307v0.F0(e10, this.f24759j, this.f24758i, this.f24757h, this.f24756g, this.f24753d, this.f24755f);
        k kVar3 = this.f24754e;
        k kVar22 = this.f24760k;
        h hVar2 = this.f24761l;
        nVar.A0(z10, z11, F022, nVar.E0(kVar3, kVar22, hVar2));
        fVar.f11306u0 = hVar2;
        AbstractC0579h.u(fVar);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f24751b) + ", style=" + this.f24752c + ", fontFamilyResolver=" + this.f24753d + ", onTextLayout=" + this.f24754e + ", overflow=" + ((Object) AbstractC3557B.E2(this.f24755f)) + ", softWrap=" + this.f24756g + ", maxLines=" + this.f24757h + ", minLines=" + this.f24758i + ", placeholders=" + this.f24759j + ", onPlaceholderLayout=" + this.f24760k + ", selectionController=" + this.f24761l + ", color=null)";
    }
}

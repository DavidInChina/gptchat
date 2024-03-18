package androidx.compose.foundation;

import A.C0038q;
import G0.X;
import id.AbstractC3557B;
import jf.C3970t;
import kotlin.Metadata;
import l0.AbstractC4325q;
import r0.AbstractC5350n;
import r0.C5334A;
import r0.L;
import r0.r;
import y.AbstractC6463a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LG0/X;", "LA/q;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackgroundElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final long f24640b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5350n f24641c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24642d;

    /* renamed from: e  reason: collision with root package name */
    public final L f24643e;

    public BackgroundElement(long j6, C5334A c5334a, float f6, L l10, int i10) {
        j6 = (i10 & 1) != 0 ? r.f44263k : j6;
        c5334a = (i10 & 2) != 0 ? null : c5334a;
        this.f24640b = j6;
        this.f24641c = c5334a;
        this.f24642d = f6;
        this.f24643e = l10;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !r.c(this.f24640b, backgroundElement.f24640b) || !AbstractC3557B.K(this.f24641c, backgroundElement.f24641c) || this.f24642d != backgroundElement.f24642d || !AbstractC3557B.K(this.f24643e, backgroundElement.f24643e)) {
            return false;
        }
        return true;
    }

    @Override // G0.X
    public final int hashCode() {
        int i10;
        int i11 = r.f44264l;
        int a5 = C3970t.a(this.f24640b) * 31;
        AbstractC5350n abstractC5350n = this.f24641c;
        if (abstractC5350n != null) {
            i10 = abstractC5350n.hashCode();
        } else {
            i10 = 0;
        }
        return this.f24643e.hashCode() + AbstractC6463a.e(this.f24642d, (a5 + i10) * 31, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A.q, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f275s0 = this.f24640b;
        abstractC4325q.f276t0 = this.f24641c;
        abstractC4325q.f277u0 = this.f24642d;
        abstractC4325q.f278v0 = this.f24643e;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        C0038q c0038q = (C0038q) abstractC4325q;
        c0038q.f275s0 = this.f24640b;
        c0038q.f276t0 = this.f24641c;
        c0038q.f277u0 = this.f24642d;
        c0038q.f278v0 = this.f24643e;
    }
}

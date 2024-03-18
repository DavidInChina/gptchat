package B;

import q0.C5251c;

/* renamed from: B.w1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174w1 implements AbstractC0130h1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ A1 f1546a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wf.k f1547b;

    public C0174w1(A1 a12, J j6) {
        this.f1546a = a12;
        this.f1547b = j6;
    }

    @Override // B.AbstractC0130h1
    public final float a(float f6) {
        A1 a12 = this.f1546a;
        long j6 = ((C5251c) this.f1547b.invoke(new C5251c(a12.d(f6)))).f43623a;
        if (a12.f1023b == W0.f1214Z) {
            return C5251c.d(j6);
        }
        return C5251c.e(j6);
    }
}

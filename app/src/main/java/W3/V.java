package w3;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public int f47778a;

    /* renamed from: b  reason: collision with root package name */
    public int f47779b;

    /* renamed from: c  reason: collision with root package name */
    public int f47780c;

    /* renamed from: d  reason: collision with root package name */
    public int f47781d;

    /* renamed from: e  reason: collision with root package name */
    public int f47782e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47783f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f47784g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47785h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47786i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f47787j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f47788k;

    /* renamed from: l  reason: collision with root package name */
    public int f47789l;

    /* renamed from: m  reason: collision with root package name */
    public long f47790m;

    /* renamed from: n  reason: collision with root package name */
    public int f47791n;

    public final void a(int i10) {
        if ((this.f47781d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f47781d));
    }

    public final int b() {
        if (this.f47784g) {
            return this.f47779b - this.f47780c;
        }
        return this.f47782e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f47778a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f47782e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f47786i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f47779b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f47780c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f47783f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f47784g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f47787j);
        sb2.append(", mRunPredictiveAnimations=");
        return AbstractC6463a.l(sb2, this.f47788k, '}');
    }
}

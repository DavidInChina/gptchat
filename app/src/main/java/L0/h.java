package L0;

import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6216a f10381a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6216a f10382b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10383c;

    public h(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, boolean z10) {
        this.f10381a = abstractC6216a;
        this.f10382b = abstractC6216a2;
        this.f10383c = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f10381a.mo122invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f10382b.mo122invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return AbstractC6463a.l(sb2, this.f10383c, ')');
    }
}

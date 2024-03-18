package G0;

import java.util.Map;

/* loaded from: classes2.dex */
public final class Q implements E0.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5666b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f5667c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ wf.k f5668d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ S f5669e;

    public Q(int i10, int i11, Map map, wf.k kVar, S s10) {
        this.f5665a = i10;
        this.f5666b = i11;
        this.f5667c = map;
        this.f5668d = kVar;
        this.f5669e = s10;
    }

    @Override // E0.O
    public final Map a() {
        return this.f5667c;
    }

    @Override // E0.O
    public final void b() {
        this.f5668d.invoke(this.f5669e.f5672m0);
    }

    @Override // E0.O
    public final int getHeight() {
        return this.f5666b;
    }

    @Override // E0.O
    public final int getWidth() {
        return this.f5665a;
    }
}

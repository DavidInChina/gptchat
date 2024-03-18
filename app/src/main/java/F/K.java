package F;

import E0.O;
import java.util.Map;

/* loaded from: classes.dex */
public final class K implements O {

    /* renamed from: a  reason: collision with root package name */
    public final int f4897a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4898b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f4899c;

    public K(int i10) {
        kf.w wVar = kf.w.f37484Y;
        if (i10 != 1) {
            this.f4899c = wVar;
        } else {
            this.f4899c = wVar;
        }
    }

    @Override // E0.O
    public final Map a() {
        return this.f4899c;
    }

    @Override // E0.O
    public final int getHeight() {
        return this.f4898b;
    }

    @Override // E0.O
    public final int getWidth() {
        return this.f4897a;
    }

    public K(int i10, int i11, Map map) {
        this.f4897a = i10;
        this.f4898b = i11;
        this.f4899c = map;
    }

    @Override // E0.O
    public final void b() {
    }
}

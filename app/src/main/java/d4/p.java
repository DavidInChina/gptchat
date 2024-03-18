package D4;

import v4.C5971a;
import x4.s;

/* loaded from: classes2.dex */
public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3412a;

    /* renamed from: b  reason: collision with root package name */
    public final C4.b f3413b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.b f3414c;

    /* renamed from: d  reason: collision with root package name */
    public final C4.b f3415d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3416e;

    public p(String str, int i10, C4.b bVar, C4.b bVar2, C4.b bVar3, boolean z10) {
        this.f3412a = i10;
        this.f3413b = bVar;
        this.f3414c = bVar2;
        this.f3415d = bVar3;
        this.f3416e = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new s(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f3413b + ", end: " + this.f3414c + ", offset: " + this.f3415d + "}";
    }
}

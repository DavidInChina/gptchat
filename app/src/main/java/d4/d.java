package D4;

import android.graphics.Path;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3347a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f3348b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.a f3349c;

    /* renamed from: d  reason: collision with root package name */
    public final C4.a f3350d;

    /* renamed from: e  reason: collision with root package name */
    public final C4.a f3351e;

    /* renamed from: f  reason: collision with root package name */
    public final C4.a f3352f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3353g;

    public d(String str, int i10, Path.FillType fillType, C4.a aVar, C4.a aVar2, C4.a aVar3, C4.a aVar4, boolean z10) {
        this.f3347a = i10;
        this.f3348b = fillType;
        this.f3349c = aVar;
        this.f3350d = aVar2;
        this.f3351e = aVar3;
        this.f3352f = aVar4;
        this.f3353g = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new x4.h(lVar, c5971a, bVar, this);
    }
}

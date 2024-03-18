package D4;

import java.util.ArrayList;
import java.util.List;
import v4.C5971a;
import x4.r;

/* loaded from: classes2.dex */
public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final C4.b f3403a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3404b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.a f3405c;

    /* renamed from: d  reason: collision with root package name */
    public final C4.a f3406d;

    /* renamed from: e  reason: collision with root package name */
    public final C4.b f3407e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3408f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3409g;

    /* renamed from: h  reason: collision with root package name */
    public final float f3410h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3411i;

    public o(String str, C4.b bVar, ArrayList arrayList, C4.a aVar, C4.a aVar2, C4.b bVar2, int i10, int i11, float f6, boolean z10) {
        this.f3403a = bVar;
        this.f3404b = arrayList;
        this.f3405c = aVar;
        this.f3406d = aVar2;
        this.f3407e = bVar2;
        this.f3408f = i10;
        this.f3409g = i11;
        this.f3410h = f6;
        this.f3411i = z10;
    }

    @Override // D4.b
    public final x4.c a(v4.l lVar, C5971a c5971a, E4.b bVar) {
        return new r(lVar, bVar, this);
    }
}

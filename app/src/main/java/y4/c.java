package y4;

import java.util.List;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final List f50714a;

    /* renamed from: c  reason: collision with root package name */
    public J4.a f50716c = null;

    /* renamed from: d  reason: collision with root package name */
    public float f50717d = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    public J4.a f50715b = a(0.0f);

    public c(List list) {
        this.f50714a = list;
    }

    public final J4.a a(float f6) {
        List list = this.f50714a;
        J4.a aVar = (J4.a) list.get(list.size() - 1);
        if (f6 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            J4.a aVar2 = (J4.a) list.get(size);
            if (this.f50715b != aVar2 && f6 >= aVar2.b() && f6 < aVar2.a()) {
                return aVar2;
            }
        }
        return (J4.a) list.get(0);
    }

    @Override // y4.b
    public final boolean b(float f6) {
        J4.a aVar = this.f50716c;
        J4.a aVar2 = this.f50715b;
        if (aVar == aVar2 && this.f50717d == f6) {
            return true;
        }
        this.f50716c = aVar2;
        this.f50717d = f6;
        return false;
    }

    @Override // y4.b
    public final J4.a c() {
        return this.f50715b;
    }

    @Override // y4.b
    public final boolean d(float f6) {
        boolean z10;
        J4.a aVar = this.f50715b;
        if (f6 >= aVar.b() && f6 < aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return !this.f50715b.c();
        }
        this.f50715b = a(f6);
        return true;
    }

    @Override // y4.b
    public final float e() {
        List list = this.f50714a;
        return ((J4.a) list.get(list.size() - 1)).a();
    }

    @Override // y4.b
    public final float f() {
        return ((J4.a) this.f50714a.get(0)).b();
    }

    @Override // y4.b
    public final boolean isEmpty() {
        return false;
    }
}

package x8;

import java.util.Map;

/* renamed from: x8.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6380y extends r {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f49630Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f49631Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6356A f49632h0;

    public C6380y(C6356A c6356a, int i10) {
        this.f49632h0 = c6356a;
        Object obj = C6356A.f49497o0;
        this.f49630Y = c6356a.j()[i10];
        this.f49631Z = i10;
    }

    public final void a() {
        int i10 = this.f49631Z;
        Object obj = this.f49630Y;
        C6356A c6356a = this.f49632h0;
        if (i10 != -1 && i10 < c6356a.size()) {
            if (M3.H.O(obj, c6356a.j()[this.f49631Z])) {
                return;
            }
        }
        Object obj2 = C6356A.f49497o0;
        this.f49631Z = c6356a.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f49630Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C6356A c6356a = this.f49632h0;
        Map b10 = c6356a.b();
        if (b10 != null) {
            return b10.get(this.f49630Y);
        }
        a();
        int i10 = this.f49631Z;
        if (i10 == -1) {
            return null;
        }
        return c6356a.k()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C6356A c6356a = this.f49632h0;
        Map b10 = c6356a.b();
        Object obj2 = this.f49630Y;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f49631Z;
        if (i10 == -1) {
            c6356a.put(obj2, obj);
            return null;
        }
        Object obj3 = c6356a.k()[i10];
        c6356a.k()[this.f49631Z] = obj;
        return obj3;
    }
}

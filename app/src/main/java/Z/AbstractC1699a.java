package Z;

import java.util.ArrayList;

/* renamed from: Z.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1699a implements AbstractC1707e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f22594a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f22595b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public Object f22596c;

    public AbstractC1699a(Object obj) {
        this.f22594a = obj;
        this.f22596c = obj;
    }

    @Override // Z.AbstractC1707e
    public final Object a() {
        return this.f22596c;
    }

    @Override // Z.AbstractC1707e
    public final void c(Object obj) {
        this.f22595b.add(this.f22596c);
        this.f22596c = obj;
    }

    @Override // Z.AbstractC1707e
    public final void clear() {
        this.f22595b.clear();
        this.f22596c = this.f22594a;
        i();
    }

    @Override // Z.AbstractC1707e
    public final void f() {
        ArrayList arrayList = this.f22595b;
        if (!arrayList.isEmpty()) {
            this.f22596c = arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("empty stack".toString());
    }

    public abstract void i();

    @Override // Z.AbstractC1707e
    public /* synthetic */ void h() {
    }
}

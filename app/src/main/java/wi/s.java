package wi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public s f48608a = null;

    /* renamed from: b  reason: collision with root package name */
    public s f48609b = null;

    /* renamed from: c  reason: collision with root package name */
    public s f48610c = null;

    /* renamed from: d  reason: collision with root package name */
    public s f48611d = null;

    /* renamed from: e  reason: collision with root package name */
    public s f48612e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f48613f = null;

    public abstract void a(L4.a aVar);

    public final void b(w wVar) {
        if (this.f48613f == null) {
            this.f48613f = new ArrayList();
        }
        this.f48613f.add(wVar);
    }

    public final void c(s sVar) {
        sVar.i();
        sVar.f(this);
        s sVar2 = this.f48610c;
        if (sVar2 != null) {
            sVar2.f48612e = sVar;
            sVar.f48611d = sVar2;
            this.f48610c = sVar;
            return;
        }
        this.f48609b = sVar;
        this.f48610c = sVar;
    }

    public final List d() {
        ArrayList arrayList = this.f48613f;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final void e(s sVar) {
        sVar.i();
        s sVar2 = this.f48612e;
        sVar.f48612e = sVar2;
        if (sVar2 != null) {
            sVar2.f48611d = sVar;
        }
        sVar.f48611d = this;
        this.f48612e = sVar;
        s sVar3 = this.f48608a;
        sVar.f48608a = sVar3;
        if (sVar.f48612e == null) {
            sVar3.f48610c = sVar;
        }
    }

    public void f(s sVar) {
        this.f48608a = sVar;
    }

    public final void g(List list) {
        if (list.isEmpty()) {
            this.f48613f = null;
        } else {
            this.f48613f = new ArrayList(list);
        }
    }

    public String h() {
        return "";
    }

    public final void i() {
        s sVar = this.f48611d;
        if (sVar != null) {
            sVar.f48612e = this.f48612e;
        } else {
            s sVar2 = this.f48608a;
            if (sVar2 != null) {
                sVar2.f48609b = this.f48612e;
            }
        }
        s sVar3 = this.f48612e;
        if (sVar3 != null) {
            sVar3.f48611d = sVar;
        } else {
            s sVar4 = this.f48608a;
            if (sVar4 != null) {
                sVar4.f48610c = sVar;
            }
        }
        this.f48608a = null;
        this.f48612e = null;
        this.f48611d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + h() + "}";
    }
}

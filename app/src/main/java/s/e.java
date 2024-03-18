package s;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public c f45010Y;

    /* renamed from: Z  reason: collision with root package name */
    public c f45011Z;

    @Override // s.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f45010Y == cVar && cVar == this.f45011Z) {
            this.f45011Z = null;
            this.f45010Y = null;
        }
        c cVar5 = this.f45010Y;
        if (cVar5 == cVar) {
            switch (((b) this).f45002h0) {
                case 0:
                    cVar3 = cVar5.f45006i0;
                    break;
                default:
                    cVar3 = cVar5.f45005h0;
                    break;
            }
            this.f45010Y = cVar3;
        }
        c cVar6 = this.f45011Z;
        if (cVar6 == cVar) {
            c cVar7 = this.f45010Y;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f45002h0) {
                    case 0:
                        cVar2 = cVar6.f45005h0;
                        break;
                    default:
                        cVar2 = cVar6.f45006i0;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f45011Z = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45011Z != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f45011Z;
        c cVar3 = this.f45010Y;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f45002h0) {
                case 0:
                    cVar = cVar2.f45005h0;
                    break;
                default:
                    cVar = cVar2.f45006i0;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f45011Z = cVar;
        return cVar2;
    }
}

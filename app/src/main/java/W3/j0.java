package w3;

import android.view.View;
import java.util.Arrays;
import java.util.List;
import k3.C4156a;
import s3.C5547J;
import w.AbstractC6067n;
import w.C6049A;
import w.C6066m;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47911a;

    /* renamed from: b  reason: collision with root package name */
    public Object f47912b;

    /* renamed from: c  reason: collision with root package name */
    public Object f47913c;

    public j0(int i10) {
        this.f47911a = i10;
        if (i10 != 1) {
            this.f47912b = new C6049A(0);
            this.f47913c = new C6066m((Object) null);
        }
    }

    public final void a(Y y10) {
        i0 i0Var = (i0) ((C6049A) this.f47912b).get(y10);
        if (i0Var == null) {
            i0Var = i0.a();
            ((C6049A) this.f47912b).put(y10, i0Var);
        }
        i0Var.f47895a |= 1;
    }

    public final void b(Y y10, C5547J c5547j) {
        i0 i0Var = (i0) ((C6049A) this.f47912b).get(y10);
        if (i0Var == null) {
            i0Var = i0.a();
            ((C6049A) this.f47912b).put(y10, i0Var);
        }
        i0Var.f47897c = c5547j;
        i0Var.f47895a |= 8;
    }

    public final void c(Y y10, C5547J c5547j) {
        i0 i0Var = (i0) ((C6049A) this.f47912b).get(y10);
        if (i0Var == null) {
            i0Var = i0.a();
            ((C6049A) this.f47912b).put(y10, i0Var);
        }
        i0Var.f47896b = c5547j;
        i0Var.f47895a |= 4;
    }

    public final void d() {
        switch (this.f47911a) {
            case 0:
                ((C6049A) this.f47912b).clear();
                ((C6066m) this.f47913c).b();
                return;
            default:
                int[] iArr = (int[]) this.f47912b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f47913c = null;
                return;
        }
    }

    public final void e(int i10) {
        Object obj = this.f47912b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i10, 10) + 1];
            this.f47912b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i10 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f47912b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f47912b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View f(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int D6;
        int i16;
        View view;
        C.b bVar = (C.b) ((h0) this.f47912b);
        int i17 = bVar.f2434Y;
        Object obj = bVar.f2435Z;
        switch (i17) {
            case 0:
                i14 = ((K) obj).C();
                break;
            default:
                i14 = ((K) obj).E();
                break;
        }
        C.b bVar2 = (C.b) ((h0) this.f47912b);
        int i18 = bVar2.f2434Y;
        Object obj2 = bVar2.f2435Z;
        switch (i18) {
            case 0:
                K k10 = (K) obj2;
                i15 = k10.f47765n;
                D6 = k10.D();
                break;
            default:
                K k11 = (K) obj2;
                i15 = k11.f47766o;
                D6 = k11.B();
                break;
        }
        int i19 = i15 - D6;
        if (i11 > i10) {
            i16 = 1;
        } else {
            i16 = -1;
        }
        View view2 = null;
        while (i10 != i11) {
            C.b bVar3 = (C.b) ((h0) this.f47912b);
            int i20 = bVar3.f2434Y;
            Object obj3 = bVar3.f2435Z;
            switch (i20) {
                case 0:
                    view = ((K) obj3).u(i10);
                    break;
                default:
                    view = ((K) obj3).u(i10);
                    break;
            }
            int i21 = ((C.b) ((h0) this.f47912b)).i(view);
            int h10 = ((C.b) ((h0) this.f47912b)).h(view);
            Object obj4 = this.f47913c;
            C4156a c4156a = (C4156a) obj4;
            c4156a.f36962b = i14;
            c4156a.f36963c = i19;
            c4156a.f36964d = i21;
            c4156a.f36965e = h10;
            if (i12 != 0) {
                ((C4156a) obj4).f36961a = i12;
                if (((C4156a) obj4).a()) {
                    return view;
                }
            }
            if (i13 != 0) {
                Object obj5 = this.f47913c;
                ((C4156a) obj5).f36961a = i13;
                if (((C4156a) obj5).a()) {
                    view2 = view;
                }
            }
            i10 += i16;
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(int i10) {
        int i11;
        int[] iArr = (int[]) this.f47912b;
        if (iArr == null || i10 >= iArr.length) {
            return -1;
        }
        Object obj = this.f47913c;
        if (((List) obj) != null) {
            List list = (List) obj;
            e0 e0Var = null;
            if (list != null) {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e0 e0Var2 = (e0) ((List) this.f47913c).get(size);
                    if (e0Var2.f47852Y == i10) {
                        e0Var = e0Var2;
                        break;
                    }
                    size--;
                }
            }
            if (e0Var != null) {
                ((List) this.f47913c).remove(e0Var);
            }
            int size2 = ((List) this.f47913c).size();
            int i12 = 0;
            while (true) {
                if (i12 < size2) {
                    if (((e0) ((List) this.f47913c).get(i12)).f47852Y >= i10) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1) {
                ((List) this.f47913c).remove(i12);
                i11 = ((e0) ((List) this.f47913c).get(i12)).f47852Y;
                if (i11 != -1) {
                    int[] iArr2 = (int[]) this.f47912b;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return ((int[]) this.f47912b).length;
                }
                int i13 = i11 + 1;
                Arrays.fill((int[]) this.f47912b, i10, i13, -1);
                return i13;
            }
        }
        i11 = -1;
        if (i11 != -1) {
        }
    }

    public final boolean h(View view) {
        int i10;
        int i11;
        int D6;
        C4156a c4156a = (C4156a) this.f47913c;
        C.b bVar = (C.b) ((h0) this.f47912b);
        int i12 = bVar.f2434Y;
        Object obj = bVar.f2435Z;
        switch (i12) {
            case 0:
                i10 = ((K) obj).C();
                break;
            default:
                i10 = ((K) obj).E();
                break;
        }
        C.b bVar2 = (C.b) ((h0) this.f47912b);
        int i13 = bVar2.f2434Y;
        Object obj2 = bVar2.f2435Z;
        switch (i13) {
            case 0:
                K k10 = (K) obj2;
                i11 = k10.f47765n;
                D6 = k10.D();
                break;
            default:
                K k11 = (K) obj2;
                i11 = k11.f47766o;
                D6 = k11.B();
                break;
        }
        int i14 = i11 - D6;
        int i15 = ((C.b) ((h0) this.f47912b)).i(view);
        int h10 = ((C.b) ((h0) this.f47912b)).h(view);
        c4156a.f36962b = i10;
        c4156a.f36963c = i14;
        c4156a.f36964d = i15;
        c4156a.f36965e = h10;
        Object obj3 = this.f47913c;
        ((C4156a) obj3).f36961a = 24579;
        return ((C4156a) obj3).a();
    }

    public final void i(int i10, int i11) {
        int[] iArr = (int[]) this.f47912b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            e(i12);
            int[] iArr2 = (int[]) this.f47912b;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill((int[]) this.f47912b, i10, i12, -1);
            List list = (List) this.f47913c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    e0 e0Var = (e0) ((List) this.f47913c).get(size);
                    int i13 = e0Var.f47852Y;
                    if (i13 >= i10) {
                        e0Var.f47852Y = i13 + i11;
                    }
                }
            }
        }
    }

    public final void j(int i10, int i11) {
        int[] iArr = (int[]) this.f47912b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            e(i12);
            int[] iArr2 = (int[]) this.f47912b;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = (int[]) this.f47912b;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List list = (List) this.f47913c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    e0 e0Var = (e0) ((List) this.f47913c).get(size);
                    int i13 = e0Var.f47852Y;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            ((List) this.f47913c).remove(size);
                        } else {
                            e0Var.f47852Y = i13 - i11;
                        }
                    }
                }
            }
        }
    }

    public final C5547J k(Y y10, int i10) {
        i0 i0Var;
        C5547J c5547j;
        int d10 = ((C6049A) this.f47912b).d(y10);
        if (d10 >= 0 && (i0Var = (i0) ((C6049A) this.f47912b).j(d10)) != null) {
            int i11 = i0Var.f47895a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                i0Var.f47895a = i12;
                if (i10 == 4) {
                    c5547j = i0Var.f47896b;
                } else if (i10 == 8) {
                    c5547j = i0Var.f47897c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    ((C6049A) this.f47912b).h(d10);
                    i0Var.f47895a = 0;
                    i0Var.f47896b = null;
                    i0Var.f47897c = null;
                    i0.f47894d.b(i0Var);
                }
                return c5547j;
            }
        }
        return null;
    }

    public final void l(Y y10) {
        i0 i0Var = (i0) ((C6049A) this.f47912b).get(y10);
        if (i0Var == null) {
            return;
        }
        i0Var.f47895a &= -2;
    }

    public final void m(Y y10) {
        int i10 = ((C6066m) this.f47913c).i() - 1;
        while (true) {
            if (i10 < 0) {
                break;
            } else if (y10 == ((C6066m) this.f47913c).j(i10)) {
                C6066m c6066m = (C6066m) this.f47913c;
                Object[] objArr = c6066m.f47599h0;
                Object obj = objArr[i10];
                Object obj2 = AbstractC6067n.f47601a;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    c6066m.f47597Y = true;
                }
            } else {
                i10--;
            }
        }
        i0 i0Var = (i0) ((C6049A) this.f47912b).remove(y10);
        if (i0Var != null) {
            i0Var.f47895a = 0;
            i0Var.f47896b = null;
            i0Var.f47897c = null;
            i0.f47894d.b(i0Var);
        }
    }

    public j0(C.b bVar) {
        this.f47911a = 2;
        this.f47912b = bVar;
        this.f47913c = new C4156a();
    }
}

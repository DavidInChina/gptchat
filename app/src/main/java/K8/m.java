package K8;

import G0.C0588q;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m extends AbstractMap implements Serializable {

    /* renamed from: n0  reason: collision with root package name */
    public static final C0588q f9568n0 = new C0588q(7);

    /* renamed from: Y  reason: collision with root package name */
    public final Comparator f9569Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f9570Z;

    /* renamed from: h0  reason: collision with root package name */
    public l f9571h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9572i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9573j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public final l f9574k0;

    /* renamed from: l0  reason: collision with root package name */
    public j f9575l0;

    /* renamed from: m0  reason: collision with root package name */
    public j f9576m0;

    public m(boolean z10) {
        C0588q c0588q = f9568n0;
        this.f9569Y = c0588q;
        this.f9570Z = z10;
        this.f9574k0 = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int i10;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f9571h0;
        C0588q c0588q = f9568n0;
        Comparator comparator = this.f9569Y;
        if (lVar3 != null) {
            if (comparator == c0588q) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f9564k0;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return lVar3;
                }
                if (i10 < 0) {
                    lVar2 = lVar3.f9560Z;
                } else {
                    lVar2 = lVar3.f9561h0;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        l lVar4 = this.f9574k0;
        if (lVar3 == null) {
            if (comparator == c0588q && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f9570Z, lVar3, obj, lVar4, lVar4.f9563j0);
            this.f9571h0 = lVar;
        } else {
            lVar = new l(this.f9570Z, lVar3, obj, lVar4, lVar4.f9563j0);
            if (i10 < 0) {
                lVar3.f9560Z = lVar;
            } else {
                lVar3.f9561h0 = lVar;
            }
            b(lVar3, true);
        }
        this.f9572i0++;
        this.f9573j0++;
        return lVar;
    }

    public final void b(l lVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (lVar != null) {
            l lVar2 = lVar.f9560Z;
            l lVar3 = lVar.f9561h0;
            int i14 = 0;
            if (lVar2 != null) {
                i10 = lVar2.f9567n0;
            } else {
                i10 = 0;
            }
            if (lVar3 != null) {
                i11 = lVar3.f9567n0;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                l lVar4 = lVar3.f9560Z;
                l lVar5 = lVar3.f9561h0;
                if (lVar5 != null) {
                    i13 = lVar5.f9567n0;
                } else {
                    i13 = 0;
                }
                if (lVar4 != null) {
                    i14 = lVar4.f9567n0;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    g(lVar3);
                    e(lVar);
                } else {
                    e(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                l lVar6 = lVar2.f9560Z;
                l lVar7 = lVar2.f9561h0;
                if (lVar7 != null) {
                    i12 = lVar7.f9567n0;
                } else {
                    i12 = 0;
                }
                if (lVar6 != null) {
                    i14 = lVar6.f9567n0;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    e(lVar2);
                    g(lVar);
                } else {
                    g(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                lVar.f9567n0 = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f9567n0 = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f9559Y;
        }
    }

    public final void c(l lVar, boolean z10) {
        l lVar2;
        int i10;
        l lVar3;
        if (z10) {
            l lVar4 = lVar.f9563j0;
            lVar4.f9562i0 = lVar.f9562i0;
            lVar.f9562i0.f9563j0 = lVar4;
        }
        l lVar5 = lVar.f9560Z;
        l lVar6 = lVar.f9561h0;
        l lVar7 = lVar.f9559Y;
        int i11 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f9567n0 > lVar6.f9567n0) {
                l lVar8 = lVar5.f9561h0;
                while (true) {
                    l lVar9 = lVar8;
                    lVar2 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    }
                    lVar8 = lVar5.f9561h0;
                }
            } else {
                l lVar10 = lVar6.f9560Z;
                while (true) {
                    lVar3 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    }
                    lVar10 = lVar6.f9560Z;
                }
                lVar2 = lVar3;
            }
            c(lVar2, false);
            l lVar11 = lVar.f9560Z;
            if (lVar11 != null) {
                i10 = lVar11.f9567n0;
                lVar2.f9560Z = lVar11;
                lVar11.f9559Y = lVar2;
                lVar.f9560Z = null;
            } else {
                i10 = 0;
            }
            l lVar12 = lVar.f9561h0;
            if (lVar12 != null) {
                i11 = lVar12.f9567n0;
                lVar2.f9561h0 = lVar12;
                lVar12.f9559Y = lVar2;
                lVar.f9561h0 = null;
            }
            lVar2.f9567n0 = Math.max(i10, i11) + 1;
            d(lVar, lVar2);
            return;
        }
        if (lVar5 != null) {
            d(lVar, lVar5);
            lVar.f9560Z = null;
        } else if (lVar6 != null) {
            d(lVar, lVar6);
            lVar.f9561h0 = null;
        } else {
            d(lVar, null);
        }
        b(lVar7, false);
        this.f9572i0--;
        this.f9573j0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f9571h0 = null;
        this.f9572i0 = 0;
        this.f9573j0++;
        l lVar = this.f9574k0;
        lVar.f9563j0 = lVar;
        lVar.f9562i0 = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVar = null;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (lVar == null) {
            return false;
        }
        return true;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.f9559Y;
        lVar.f9559Y = null;
        if (lVar2 != null) {
            lVar2.f9559Y = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f9560Z == lVar) {
                lVar3.f9560Z = lVar2;
                return;
            } else {
                lVar3.f9561h0 = lVar2;
                return;
            }
        }
        this.f9571h0 = lVar2;
    }

    public final void e(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f9560Z;
        l lVar3 = lVar.f9561h0;
        l lVar4 = lVar3.f9560Z;
        l lVar5 = lVar3.f9561h0;
        lVar.f9561h0 = lVar4;
        if (lVar4 != null) {
            lVar4.f9559Y = lVar;
        }
        d(lVar, lVar3);
        lVar3.f9560Z = lVar;
        lVar.f9559Y = lVar3;
        int i12 = 0;
        if (lVar2 != null) {
            i10 = lVar2.f9567n0;
        } else {
            i10 = 0;
        }
        if (lVar4 != null) {
            i11 = lVar4.f9567n0;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f9567n0 = max;
        if (lVar5 != null) {
            i12 = lVar5.f9567n0;
        }
        lVar3.f9567n0 = Math.max(max, i12) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f9575l0;
        if (jVar == null) {
            j jVar2 = new j(this, 0);
            this.f9575l0 = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final void g(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f9560Z;
        l lVar3 = lVar.f9561h0;
        l lVar4 = lVar2.f9560Z;
        l lVar5 = lVar2.f9561h0;
        lVar.f9560Z = lVar5;
        if (lVar5 != null) {
            lVar5.f9559Y = lVar;
        }
        d(lVar, lVar2);
        lVar2.f9561h0 = lVar;
        lVar.f9559Y = lVar2;
        int i12 = 0;
        if (lVar3 != null) {
            i10 = lVar3.f9567n0;
        } else {
            i10 = 0;
        }
        if (lVar5 != null) {
            i11 = lVar5.f9567n0;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f9567n0 = max;
        if (lVar4 != null) {
            i12 = lVar4.f9567n0;
        }
        lVar2.f9567n0 = Math.max(max, i12) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        l lVar;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar != null) {
                return null;
            }
            return lVar.f9566m0;
        }
        lVar = null;
        if (lVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f9576m0;
        if (jVar == null) {
            j jVar2 = new j(this, 1);
            this.f9576m0 = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f9570Z) {
                throw new NullPointerException("value == null");
            }
            l a5 = a(obj, true);
            Object obj3 = a5.f9566m0;
            a5.f9566m0 = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        l lVar;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar != null) {
                c(lVar, true);
            }
            if (lVar != null) {
                return null;
            }
            return lVar.f9566m0;
        }
        lVar = null;
        if (lVar != null) {
        }
        if (lVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9572i0;
    }
}

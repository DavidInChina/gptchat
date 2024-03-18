package Ig;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class f extends AbstractList implements RandomAccess, List {

    /* renamed from: Y  reason: collision with root package name */
    public int f8600Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f8601Z;

    public static /* synthetic */ void f(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f8600Y)) {
            if (i11 == 0) {
                this.f8601Z = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f8601Z = new Object[]{obj, this.f8601Z};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f8601Z;
                } else {
                    Object[] objArr2 = (Object[]) this.f8601Z;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f8600Y - i10);
                }
                objArr[i10] = obj;
                this.f8601Z = objArr;
            }
            this.f8600Y++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index: ", i10, ", Size: ");
        q10.append(this.f8600Y);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f8601Z = null;
        this.f8600Y = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f8600Y)) {
            if (i11 == 1) {
                return this.f8601Z;
            }
            return ((Object[]) this.f8601Z)[i10];
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index: ", i10, ", Size: ");
        q10.append(this.f8600Y);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i10 = this.f8600Y;
        if (i10 == 0) {
            return d.f8596Y;
        }
        if (i10 == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        f(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 >= 0 && i10 < (i11 = this.f8600Y)) {
            if (i11 == 1) {
                obj = this.f8601Z;
                this.f8601Z = null;
            } else {
                Object[] objArr = (Object[]) this.f8601Z;
                Object obj2 = objArr[i10];
                if (i11 == 2) {
                    this.f8601Z = objArr[1 - i10];
                } else {
                    int i12 = (i11 - i10) - 1;
                    if (i12 > 0) {
                        System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                    }
                    objArr[this.f8600Y - 1] = null;
                }
                obj = obj2;
            }
            this.f8600Y--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index: ", i10, ", Size: ");
        q10.append(this.f8600Y);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f8600Y)) {
            if (i11 == 1) {
                Object obj2 = this.f8601Z;
                this.f8601Z = obj;
                return obj2;
            }
            Object[] objArr = (Object[]) this.f8601Z;
            Object obj3 = objArr[i10];
            objArr[i10] = obj;
            return obj3;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index: ", i10, ", Size: ");
        q10.append(this.f8600Y);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8600Y;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        int i10 = this.f8600Y;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f8601Z, 0, i10, comparator);
        }
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i10 = this.f8600Y;
            if (i10 == 1) {
                if (length != 0) {
                    objArr[0] = this.f8601Z;
                } else {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                    objArr2[0] = this.f8601Z;
                    return objArr2;
                }
            } else if (length < i10) {
                Object[] copyOf = Arrays.copyOf((Object[]) this.f8601Z, i10, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                f(6);
                throw null;
            } else if (i10 != 0) {
                System.arraycopy(this.f8601Z, 0, objArr, 0, i10);
            }
            int i11 = this.f8600Y;
            if (length > i11) {
                objArr[i11] = null;
            }
            return objArr;
        }
        f(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i10 = this.f8600Y;
        if (i10 == 0) {
            this.f8601Z = obj;
        } else if (i10 == 1) {
            this.f8601Z = new Object[]{this.f8601Z, obj};
        } else {
            Object[] objArr = (Object[]) this.f8601Z;
            int length = objArr.length;
            if (i10 >= length) {
                int z10 = android.gov.nist.core.a.z(length, 3, 2, 1);
                int i11 = i10 + 1;
                if (z10 < i11) {
                    z10 = i11;
                }
                Object[] objArr2 = new Object[z10];
                this.f8601Z = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f8600Y] = obj;
        }
        this.f8600Y++;
        ((AbstractList) this).modCount++;
        return true;
    }
}

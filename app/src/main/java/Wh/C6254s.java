package wh;

import Sh.EnumC1397c;
import Sh.EnumC1400f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import yh.l1;

/* renamed from: wh.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6254s extends AbstractC6251p {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f48568Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f48569h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Iterable f48570i0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6254s(Class cls) {
        this(r1, r4);
        this.f48568Z = 0;
        EnumC1400f a5 = EnumC1400f.a();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        a5.b(declaredConstructors, EnumC1397c.f16712Y);
        EnumC1400f a10 = EnumC1400f.a();
        Method[] declaredMethods = cls.getDeclaredMethods();
        a10.b(declaredMethods, Sh.H.f16700Y);
    }

    public final AbstractC6242g I(int i10) {
        int i11 = this.f48568Z;
        List list = this.f48569h0;
        Iterable iterable = this.f48570i0;
        switch (i11) {
            case 0:
                List list2 = (List) iterable;
                if (i10 < list2.size()) {
                    return new AbstractC6240e((Constructor) list2.get(i10));
                }
                return new AbstractC6240e((Method) list.get(i10 - list2.size()));
            default:
                return new C6245j((l1) iterable, (C6247l) list.get(i10));
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        switch (this.f48568Z) {
            case 0:
                return I(i10);
            default:
                return I(i10);
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f48568Z;
        List list = this.f48569h0;
        switch (i10) {
            case 0:
                return list.size() + ((List) this.f48570i0).size();
            default:
                return list.size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6254s(Iterable iterable, List list, int i10) {
        super(0);
        this.f48568Z = i10;
        this.f48570i0 = iterable;
        this.f48569h0 = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6254s(Constructor[] constructorArr, Method[] methodArr) {
        this(Arrays.asList(constructorArr), Arrays.asList(methodArr), 0);
        this.f48568Z = 0;
    }
}

package j$.util.stream;

import j$.util.C3721e;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes3.dex */
public final /* synthetic */ class O0 implements LongFunction, IntFunction {

    /* renamed from: a  reason: collision with root package name */
    public IntFunction f35489a;

    public /* synthetic */ O0(IntFunction intFunction) {
        this.f35489a = intFunction;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        Object apply = this.f35489a.apply(i10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        C3721e.a(apply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j6) {
        int i10 = M0.f35472l;
        return AbstractC3855y0.Z(j6, this.f35489a);
    }
}

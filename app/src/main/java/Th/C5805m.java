package th;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* renamed from: th.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5805m extends AbstractC5803k {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f46226Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f46227h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5805m(int i10, List list) {
        super(0);
        this.f46226Z = i10;
        this.f46227h0 = list;
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f46227h0;
        int i11 = this.f46226Z;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return (AbstractC5802j) list.get(i10);
                    default:
                        Annotation annotation = (Annotation) list.get(i10);
                        return new C5795c(annotation, annotation.annotationType());
                }
            default:
                switch (i11) {
                    case 0:
                        return (AbstractC5802j) list.get(i10);
                    default:
                        Annotation annotation2 = (Annotation) list.get(i10);
                        return new C5795c(annotation2, annotation2.annotationType());
                }
        }
    }

    @Override // Qh.AbstractC1239q, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10 = this.f46226Z;
        List list = this.f46227h0;
        switch (i10) {
            case 0:
                return list.size();
            default:
                return list.size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5805m(Annotation[] annotationArr) {
        this(1, Arrays.asList(annotationArr));
        this.f46226Z = 1;
    }
}

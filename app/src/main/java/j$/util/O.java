package j$.util;

/* loaded from: classes3.dex */
public interface O extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    /* renamed from: trySplit */
    O mo106trySplit();
}

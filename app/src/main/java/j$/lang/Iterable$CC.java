package j$.lang;

import j$.util.Objects;
import java.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        Objects.requireNonNull(consumer);
        for (Object obj : iterable) {
            consumer.accept(obj);
        }
    }
}

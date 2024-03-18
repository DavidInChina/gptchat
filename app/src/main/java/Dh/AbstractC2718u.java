package dh;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* renamed from: dh.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2718u extends AbstractC2717t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2718u(KSerializer kSerializer) {
        super(kSerializer);
        AbstractC3557B.c0("element", kSerializer);
    }

    @Override // dh.AbstractC2689a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC3557B.c0("<this>", collection);
        return collection.iterator();
    }

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC3557B.c0("<this>", collection);
        return collection.size();
    }
}

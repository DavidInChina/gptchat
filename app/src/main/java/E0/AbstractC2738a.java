package e0;

import id.AbstractC3557B;
import java.util.Map;
import kf.AbstractC4285j;

/* renamed from: e0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2738a extends AbstractC4285j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry2.getKey();
        C2743f c2743f = ((C2745h) this).f28701Y;
        Object obj2 = c2743f.get(key);
        if (obj2 != null) {
            return AbstractC3557B.K(obj2, entry2.getValue());
        }
        if (entry2.getValue() != null || !c2743f.containsKey(entry2.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        return ((C2745h) this).f28701Y.remove(entry2.getKey(), entry2.getValue());
    }
}

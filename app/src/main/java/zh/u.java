package zh;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import yh.AbstractC6632q;
import yh.z1;

/* loaded from: classes.dex */
public abstract class u extends t implements v {
    public final r F0(Type... typeArr) {
        Iterator it = new z1(Arrays.asList(typeArr)).iterator();
        u uVar = this;
        while (it.hasNext()) {
            uVar = uVar.a((AbstractC6632q) it.next());
        }
        return uVar;
    }
}

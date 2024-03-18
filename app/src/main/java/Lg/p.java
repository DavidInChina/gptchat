package lg;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class p extends AbstractC4456a implements Serializable {
    public static C4470o e(AbstractC4468m abstractC4468m, p pVar, int i10, C4452J c4452j, Class cls) {
        return new C4470o(abstractC4468m, Collections.emptyList(), pVar, new C4469n(i10, c4452j, true), cls);
    }

    public static C4470o f(AbstractC4468m abstractC4468m, Serializable serializable, p pVar, int i10, EnumC4454L enumC4454L, Class cls) {
        return new C4470o(abstractC4468m, serializable, pVar, new C4469n(i10, enumC4454L, false), cls);
    }
}

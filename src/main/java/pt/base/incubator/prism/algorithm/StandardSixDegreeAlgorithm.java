package pt.base.incubator.prism.algorithm;

import org.springframework.stereotype.Component;

@Component
public class StandardSixDegreeAlgorithm extends AbstractAlgorithm<Long> {

	public StandardSixDegreeAlgorithm() {
		this.maxLongArgument = 100L;
		this.minLongArgument = 3L;
	}

	@Override
	public boolean implementation(Long argument) {

		for (int i = 0; i < argument; i++) {
			if (isCanceled()) {
				return false;
			}

			for (int j = 0; j < argument; j++) {
				if (isCanceled()) {
					return false;
				}

				for (int k = 0; k < argument; k++) {
					if (isCanceled()) {
						return false;
					}

					for (int l = 0; l < argument; l++) {
						if (isCanceled()) {
							return false;
						}

						for (int m = 0; m < argument; m++) {
							if (isCanceled()) {
								return false;
							}

							for (int n = 0; n < argument; n++) {
								if (isCanceled()) {
									return false;
								}
							}
						}
					}
				}
			}
		}

		return true;
	}

	@Override
	public Long argumentProducer() {
		return (long) (Math.random() * maxLongArgument) + minLongArgument;
	}

	@Override
	public String toString() {
		return "StandardSixDegreeAlgorithm";
	}
}

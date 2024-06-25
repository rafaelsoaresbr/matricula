import { ViewConfig } from '@vaadin/hilla-file-router/types.js';
import { AutoCrud } from '@vaadin/hilla-react-crud';
import { EscolaEndpoint } from 'Frontend/generated/endpoints';
import EscolaModel from 'Frontend/generated/io/dedyn/rafaelsoaresbr/data/EscolaModel';

export const config: ViewConfig = {
	menu: { order: 3, icon: 'line-awesome/svg/school-solid.svg' },
	title: 'Escolas',
	rolesAllowed: ['ADMIN'],
};

export default function EscolasView() {
	return (

		<div className="flex flex-col v-full items-center justify-center p-l text-center box-border">

			<AutoCrud service={EscolaEndpoint} model={EscolaModel} />

		</div>

	);
}
